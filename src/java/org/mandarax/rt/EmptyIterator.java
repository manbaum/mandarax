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

package org.mandarax.rt;

/**
 * Empty iterator. Uses the singleton pattern.
 * @author jens dietrich
 * @param <T> the type of the iterated element
 */

public class EmptyIterator extends AbstractIterator {

	/**
	 * Return the default instance.
	 * @return the instance
	 */
	public static ResourceIterator DEFAULT = new EmptyIterator() ; 
	
	private EmptyIterator() {
		super();
	}

	public boolean hasNext() {
		return false;
	}

	public Object next() {
		throw new RuntimeException("this is an empty iterator");
	}

	public void close() {
		// nothing to do here
	}



}
