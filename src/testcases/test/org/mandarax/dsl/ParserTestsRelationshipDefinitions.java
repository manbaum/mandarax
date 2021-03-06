/*
 * Copyright 2010 Jens Dietrich 
 * Licensed under the GNU AFFERO GENERAL PUBLIC LICENSE, Version 3 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.gnu.org/licenses/agpl.html 
 * Unless required by applicable law or agreed to in writing, software distributed under the 
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language governing permissions 
 * and limitations under the License.
 */

package test.org.mandarax.dsl;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.mandarax.dsl.*;
import org.mandarax.dsl.parser.ScriptException;

import static test.org.mandarax.dsl.TestUtils.*;

/**
 * Test cases for queries.
 * @author jens dietrich
 */
public class ParserTestsRelationshipDefinitions extends AbstractTests {
	
	@Test
	public void testQuery1() throws Exception {
		RelationshipDefinition rel = readRelationshipDefinition("rel Height(com.example.Person p,int value) queries getHeight(p)  {\nrule1: Giant(p)-> Height(p,200);\n}");
		assertEquals("Height",rel.getName());
		
		List<VariableDeclaration> slots = rel.getSlotDeclarations();
		assertEquals(2,slots.size());
		assertEquals("com.example.Person",slots.get(0).getType());
		assertEquals("p",slots.get(0).getName());
		assertEquals("int",slots.get(1).getType());
		assertEquals("value",slots.get(1).getName());
		
		List<FunctionDeclaration> queries = rel.getQueries();
		assertEquals(1,queries.size());
		assertEquals(Visibility.PUBLIC,queries.get(0).getVisibility());
		assertEquals("getHeight",queries.get(0).getName());
		assertEquals(1,queries.get(0).getParameterNames().size());
		assertEquals("p",queries.get(0).getParameterNames().get(0));
		
		List<String> superRels = rel.getSuperTypes();
		assertEquals(0,superRels.size());
		
		List<Rule> rules = rel.getRules();
		assertEquals(1,rules.size());
		assertEquals("rule1",rules.get(0).getId());
	}
	
	@Test
	public void testQuery2() throws Exception {
		RelationshipDefinition rel = readRelationshipDefinition("relationship Height(com.example.Person p,int value) extends Size queries private getHeight(p) {\nrule1: Giant(p)-> Height(p,200);\n}");
		assertEquals("Height",rel.getName());
		
		List<VariableDeclaration> slots = rel.getSlotDeclarations();
		assertEquals(2,slots.size());
		assertEquals("com.example.Person",slots.get(0).getType());
		assertEquals("p",slots.get(0).getName());
		assertEquals("int",slots.get(1).getType());
		assertEquals("value",slots.get(1).getName());
		
		List<FunctionDeclaration> queries = rel.getQueries();
		assertEquals(1,queries.size());
		assertEquals(Visibility.PRIVATE,queries.get(0).getVisibility());
		assertEquals("getHeight",queries.get(0).getName());
		assertEquals(1,queries.get(0).getParameterNames().size());
		assertEquals("p",queries.get(0).getParameterNames().get(0));
		
		List<String> superRels = rel.getSuperTypes();
		assertEquals(1,superRels.size());
		assertEquals("Size",superRels.get(0));
		
		List<Rule> rules = rel.getRules();
		assertEquals(1,rules.size());
		assertEquals("rule1",rules.get(0).getId());
	}
	
	
	@Test
	public void testQuery3() throws Exception {
		RelationshipDefinition rel = readRelationshipDefinition("rel Height(com.example.Person p,int value) extends com.example.Size,com.example.Size2 queries private getHeight(p,value), public getHeightForPerson(p), getHeights()\n{\nrule1: Giant(p)-> Height(p,200);\n}");
		assertEquals("Height",rel.getName());
		
		List<VariableDeclaration> slots = rel.getSlotDeclarations();
		assertEquals(2,slots.size());
		assertEquals("com.example.Person",slots.get(0).getType());
		assertEquals("p",slots.get(0).getName());
		assertEquals("int",slots.get(1).getType());
		assertEquals("value",slots.get(1).getName());
		
		List<FunctionDeclaration> queries = rel.getQueries();
		assertEquals(3,queries.size());
		
		assertEquals(Visibility.PRIVATE,queries.get(0).getVisibility());
		assertEquals("getHeight",queries.get(0).getName());
		assertEquals(2,queries.get(0).getParameterNames().size());
		assertEquals("p",queries.get(0).getParameterNames().get(0));
		assertEquals("value",queries.get(0).getParameterNames().get(1));
		
		assertEquals(Visibility.PUBLIC,queries.get(1).getVisibility());
		assertEquals("getHeightForPerson",queries.get(1).getName());
		assertEquals(1,queries.get(1).getParameterNames().size());
		assertEquals("p",queries.get(1).getParameterNames().get(0));
		
		assertEquals(Visibility.PUBLIC,queries.get(2).getVisibility());
		assertEquals("getHeights",queries.get(2).getName());
		assertEquals(0,queries.get(2).getParameterNames().size());
		
		List<String> superRels = rel.getSuperTypes();
		assertEquals(2,superRels.size());
		assertEquals("com.example.Size",superRels.get(0));
		assertEquals("com.example.Size2",superRels.get(1));
		
		List<Rule> rules = rel.getRules();
		assertEquals(1,rules.size());
		assertEquals("rule1",rules.get(0).getId());
	}

	// p1 is not defined
	@Test(expected=ScriptException.class)
	public void testQuery4() throws Exception {
		readRelationshipDefinition("rel Height(com.example.Person p,int value) queries getHeight(p1) {\nrule1: Giant(p)-> Height(p,200);\n}");
	}
	
	
	
	@Test
	public void testQuery5() throws Exception {
		RelationshipDefinition rel = readRelationshipDefinition("@id=\"rel42\" \n rel Height(com.example.Person p,int value) queries getHeight(p)   {\nrule1: Giant(p)-> Height(p,200);\n}");
		
		List<Annotation> annotations = rel.getAnnotations();
		assertEquals(1,annotations.size());
		assertEquals("id",annotations.get(0).getKey());
		assertEquals("rel42",annotations.get(0).getValue());
		
		assertEquals("Height",rel.getName());
		
		List<VariableDeclaration> slots = rel.getSlotDeclarations();
		assertEquals(2,slots.size());
		assertEquals("com.example.Person",slots.get(0).getType());
		assertEquals("p",slots.get(0).getName());
		assertEquals("int",slots.get(1).getType());
		assertEquals("value",slots.get(1).getName());
		
		List<FunctionDeclaration> queries = rel.getQueries();
		assertEquals(1,queries.size());
		assertEquals(Visibility.PUBLIC,queries.get(0).getVisibility());
		assertEquals("getHeight",queries.get(0).getName());
		assertEquals(1,queries.get(0).getParameterNames().size());
		assertEquals("p",queries.get(0).getParameterNames().get(0));
		
		List<String> superRels = rel.getSuperTypes();
		assertEquals(0,superRels.size());
		
		List<Rule> rules = rel.getRules();
		assertEquals(1,rules.size());
		assertEquals("rule1",rules.get(0).getId());
	}
	
	
	@Test
	public void testQuery6() throws Exception {
		RelationshipDefinition rel = readRelationshipDefinition("@id=\"rel42\" \n @author = \"jens\"\r\nrel Height(com.example.Person p,int value) queries getHeight(p)   {\nrule1: Giant(p)-> Height(p,200);\n\r\nrule2: OtherGiant(p)-> Height(p,200);\n}");
		
		List<Annotation> annotations = rel.getAnnotations();
		assertEquals(2,annotations.size());
		assertEquals("id",annotations.get(0).getKey());
		assertEquals("rel42",annotations.get(0).getValue());
		assertEquals("author",annotations.get(1).getKey());
		assertEquals("jens",annotations.get(1).getValue());
		
		assertEquals("Height",rel.getName());
		
		List<VariableDeclaration> slots = rel.getSlotDeclarations();
		assertEquals(2,slots.size());
		assertEquals("com.example.Person",slots.get(0).getType());
		assertEquals("p",slots.get(0).getName());
		assertEquals("int",slots.get(1).getType());
		assertEquals("value",slots.get(1).getName());
		
		List<FunctionDeclaration> queries = rel.getQueries();
		assertEquals(1,queries.size());
		assertEquals(Visibility.PUBLIC,queries.get(0).getVisibility());
		assertEquals("getHeight",queries.get(0).getName());
		assertEquals(1,queries.get(0).getParameterNames().size());
		assertEquals("p",queries.get(0).getParameterNames().get(0));
		
		List<String> superRels = rel.getSuperTypes();
		assertEquals(0,superRels.size());
		
		List<Rule> rules = rel.getRules();
		assertEquals(2,rules.size());
		assertEquals("rule1",rules.get(0).getId());
		assertEquals("rule2",rules.get(1).getId());
	}
	
	// names of relationship and rule head do not match
	@Test(expected=ScriptException.class)
	public void testQuery7() throws Exception {
		readRelationshipDefinition("rel Height(com.example.Person p,int value) queries getHeight(p)  {\nrule1: Giant(p)-> Height2(p,200);\n}");
	}
	
	// number of params of relationship and rule head do not match
	@Test(expected=ScriptException.class)
	public void testQuery8() throws Exception {
		readRelationshipDefinition("rel Height(com.example.Person p,int value) queries getHeight(p)  {\nrule1: Giant(p)-> Height(200);\n}");
	}
		
}
