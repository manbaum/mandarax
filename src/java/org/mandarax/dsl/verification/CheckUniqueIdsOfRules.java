/*
 * Copyright 2010 Jens Dietrich Licensed under the GNU AFFERO GENERAL PUBLIC LICENSE, Version 3
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.gnu.org/licenses/agpl.html Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.mandarax.dsl.verification;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.mandarax.dsl.CompilationUnit;
import org.mandarax.dsl.RelationshipDefinition;
import org.mandarax.dsl.RelationshipDefinitionPart;
import org.mandarax.dsl.Rule;
import org.mandarax.dsl.VerificationErrorReporter;
import org.mandarax.dsl.VerificationException;
import org.mandarax.dsl.Verifier;

/**
 * Ensure that rule ids are unique.
 * @author jens dietrich
 */
public class CheckUniqueIdsOfRules implements Verifier {

	@Override
	public void verify(Collection<CompilationUnit> cus,VerificationErrorReporter errorHandler) throws VerificationException {
		for (CompilationUnit cu:cus) {
			for (RelationshipDefinition rel:cu.getRelationshipDefinitions()) {
				Set<String> ids = new HashSet<String>();
				for (RelationshipDefinitionPart defPart:rel.getDefinitionParts()) {
					String id = defPart.getId();
					if (ids.contains(id)) {
						errorHandler.reportError(cu,"The id used by rule ",defPart," at ", defPart.getPosition()," has already been used within this relationship definition");
					}
					else {
						ids.add(id);
					}
				}
			}
		}
		
	}

}
