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

package org.mandarax.dsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Annotatable node.
 * @author jens dietrich
 */
public abstract class AnnotatableNode extends ASTNode {
	
	public AnnotatableNode(Position position, Context context) {
		super(position, context);
	}
	private List<Annotation> annotations = new ArrayList<Annotation>();
	public void addAnnotation(Annotation annotation) {
		annotations.add(annotation);
	}
	public void addAnnotations(List<Annotation> list) {
		annotations.addAll(list);
	}
	public List<Annotation> getAnnotations() {
		return annotations;
	}
	
	public boolean isAnnotated() {
		List<Annotation> annotations = getAnnotations();
		return annotations==null || annotations.size()==0;
	}
	@Override
	protected void copyPropertiesTo(ASTNode node) {
		super.copyPropertiesTo(node);
		if (node instanceof AnnotatableNode) {
			AnnotatableNode aNode = (AnnotatableNode)node;
			for (Annotation annotation:annotations) {
				aNode.addAnnotation(new Annotation(annotation.getPosition(),annotation.getContext(),annotation.getKey(),annotation.getValue()));
			}
		}
	}
}
