/*
 * Copyright 2010 Jens Dietrich Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.mandarax.compiler.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.mandarax.compiler.CompilerException;
import org.mandarax.dsl.Expression;
import org.mandarax.dsl.FunctionDeclaration;
import org.mandarax.dsl.FunctionInvocation;
import org.mandarax.dsl.RelationshipDefinition;
import org.mandarax.dsl.Variable;

import com.google.common.base.Function;

import static com.google.common.base.Preconditions.*;

/**
 * Annotation description of prerequisites. 
 * @author jens dietrich
 */
public class Prereq {
	private Expression expression = null;
	private Collection<Expression> newlyBoundVariables = new LinkedHashSet<Expression>(); 
	// a collection of bound variables
	private Collection<Expression> boundVariables = new LinkedHashSet<Expression>();
	
	// the previous prerequisite
	private Prereq previous = null;
	
	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	public Collection<Expression> getNewlyBoundVariables() {
		return newlyBoundVariables;
	}
	public void setNewlyBoundVariables(Collection<Expression> newlyBoundVariables) {
		this.newlyBoundVariables = newlyBoundVariables;
	}
	
	public boolean bindsNewVariables() {
		return this.newlyBoundVariables.size()>0;
	}

	public boolean isDefinedByRelationship() {
		return expression instanceof FunctionInvocation && (((FunctionInvocation)expression).isDefinedByRelationship());
	}
	
	public RelationshipDefinition getRel() {
		if (expression instanceof FunctionInvocation) {
			return (((FunctionInvocation)expression).getRelationship());
		}
		return null;
	}
	
	// get the query to be invoked for a function invocation that references a relationship definition
	public FunctionDeclaration getQuery() throws CompilerException {
		FunctionInvocation finv = (FunctionInvocation)getExpression();
		RelationshipDefinition rel = finv.getRelationship();
		boolean[] signature = new boolean[rel.getSlotDeclarations().size()];
		for (int i=0;i<signature.length;i++) {
			Expression term = finv.getParameters().get(i);
			signature[i]=isBound(term) && !isNewlyBound(term); 
		}
		for (FunctionDeclaration query:rel.getQueries()) {
			if (Arrays.equals(signature,query.getSignature())) {
				return query;
			}
		}
		throw new CompilerException("Cannot find matching query for function invocation: " + finv);
	}
	public Collection<Expression> getBoundVariables() {
		return boundVariables;
	}
	public void setBoundVariables(Collection<Expression> boundVariables) {
		this.boundVariables = boundVariables;
	}
	
	private boolean isNewlyBound(Expression expression) {
		for (Variable var:expression.getVariables()) {
			if (!newlyBoundVariables.contains(var)) return false;
		}
		return true;
	}
	
	private boolean isBound(Expression expression) {
		for (Variable var:expression.getVariables()) {
			if (!boundVariables.contains(var)) return false;
		}
		return true;
	}
	
	public String printBoundParams(String scope,String arg) {
		StringBuffer buf = new StringBuffer();
		buf.append(arg);
		for (Expression expr:((FunctionInvocation)expression).getParameters()) {
			if (isBound(expr) && !isNewlyBound(expr)) {
				buf.append(',');
				buf.append(print(expr,scope));
			}
		}
		
		return buf.toString();
	}
	
	private String print(Expression expression,final String scope) {
		Function<Variable,String> conversion = new Function<Variable,String>() {
			@Override
			public String apply(Variable v) {
				return scope + '.' + v.getName();
			}
		};
		StringBuffer b = new StringBuffer();
		expression.appendTo(b, conversion);
		return b.toString();
	}
	// indicates whether this is the first prereq defined by a relation
	public boolean isFirstRelation() {
		for (Prereq pred:getPreds()) {
			if (pred.isDefinedByRelationship()) return false;
		}
		return this.isDefinedByRelationship();
	}
	
	public Prereq getPreviousRelPrereq() {
		List<Prereq> preds = getPreds();
		for (int i=0;i<preds.size();i++) {
			Prereq prev = preds.get(preds.size()-(i+1));
			if (prev.isDefinedByRelationship()) return prev;
		}
		return null;
	}
	
	private List<Prereq> getPreds() {
		List<Prereq> list = new ArrayList<Prereq>();
		if (previous!=null) {
			list.add(previous);
			list.addAll(previous.getPreds());
		}
		return list;
	}
	public Prereq getPrevious() {
		return previous;
	}
	public void setPrevious(Prereq previous) {
		this.previous = previous;
	}
	// get the name of the slot in the predicate that is referenced by a newly introduced variable
	public String getSlot(String variableName) throws CompilerException {
		checkState(expression instanceof FunctionInvocation,"Expression %s must be a function invocation",expression);
		FunctionInvocation fi = (FunctionInvocation)expression;
		checkState(fi.getRelationship()!=null,"Expression %s must be a function reference",fi);
		RelationshipDefinition rel = this.getRel();
		
		FunctionDeclaration query = getQuery();
		
		for (int i=0;i<fi.getParameters().size();i++) {
			Expression param = fi.getParameters().get(i);
			//checkState(param.isFlat(),"Only flat expressions are supported here"); 
			if (param instanceof Variable && ((Variable)param).getName().equals(variableName)) {
				return rel.getSlotDeclarations().get(i).getName();
			}
		}
		
		return null;
	
	}
	public boolean hasPreviousRelPrereq() {
		return this.getPreviousRelPrereq()!=null;
	}
	//print the expression, add scope to variable references
	public String printScoped(final String scope) {
		StringBuffer b = new StringBuffer();
		Function<Variable,String> conversion = new Function<Variable,String>() {

			@Override
			public String apply(Variable v) {
				return scope+'.'+v.getName();
			}
			
		};
		this.expression.appendTo(b,conversion);
		return b.toString();
	}
	
}
