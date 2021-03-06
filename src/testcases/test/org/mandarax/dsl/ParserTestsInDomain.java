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
import org.junit.Test;
import org.mandarax.dsl.*;
import static test.org.mandarax.dsl.TestUtils.*;

/**
 * Test cases for in domain expressions.
 * @author jens dietrich
 */

public class ParserTestsInDomain extends AbstractTests {
	
	@Test
	public void testFunctionInvocation1() throws Exception {
		Expression expression = readExpression("x in aSet");
		print(expression);
		assertTrue(expression instanceof FunctionInvocation);
		FunctionInvocation fi = (FunctionInvocation)expression;
		assertEquals("_InDomain",fi.getFunction());
		assertEquals(2,fi.getParameters().size());
		assertEquals("x",((Variable)fi.getParameters().get(0)).getName());
		assertEquals("aSet",((Variable)fi.getParameters().get(1)).getName());
		assertTrue(fi.isBuiltInPredicate());
	}
	
}
