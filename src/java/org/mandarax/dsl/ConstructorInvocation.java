/*
 * Copyright 2010 Jens Dietrich 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions 
 * and limitations under the License.
 */

package org.mandarax.dsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
 * Constructor invocation.
 * @author jens dietrich
 */
public class ConstructorInvocation extends Expression {

	private String type = null;
	private List<Expression> parameters = new ArrayList<Expression>();
	
	public ConstructorInvocation(Position position,Context context,String type,List<Expression> parameters) {
		super(position,context);
		this.type = type;
		this.parameters = parameters;
	}

	public String getTypeName() {
		return type;
	}



	public List<Expression> getParameters() {
		return parameters;
	}
	
	@Override
	public void accept(ASTVisitor visitor) {
		if (visitor.visit(this)) {
			for (Expression param:parameters) {
				param.accept(visitor);
			}
		}
		visitor.endVisit(this);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((parameters == null) ? 0 : parameters.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConstructorInvocation other = (ConstructorInvocation) obj;
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.equals(other.parameters))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public List<Expression> getChildren() {
		List<Expression> children = new ArrayList<Expression>();
		children.addAll(this.parameters);
		return children;
	}
	
	
	@Override
	public Expression substitute(final Map<Expression,Expression> substitutions) {
		Expression substituteThis = substitutions.get(this);
		if (substituteThis!=null) {
			return new ConstructorInvocation(getPosition(),getContext(),type,Lists.transform(parameters, new Function<Expression,Expression>() {
				@Override
				public Expression apply(Expression p) {
					return p.substitute(substitutions);
				}}));
		}
		else {
			return substituteThis;
		}
	}
}
