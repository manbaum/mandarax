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
import org.junit.runner.RunWith;

import org.junit.runners.*;

/**
 * Test suite containing all verification tests.
 * @author jens dietrich
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
	VerifierTestsCheckUniqueNamesInObjectDeclarations.class,
	VerifierTestsCheckReferencesInObjectDeclarations.class,
	VerifierTestsCheckUniqueIdsOfRules.class,
	VerifierCheckFreeVariablesInFacts.class,
	VerifierCheckFreeVariablesInExternalFacts.class,
	// other
	ResolverTests.class,
	TypeReasonerTests.class
})
public class TestSuiteForVerification {

}

