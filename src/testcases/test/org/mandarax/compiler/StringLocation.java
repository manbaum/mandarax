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

package test.org.mandarax.compiler;

import java.io.StringWriter;
import java.io.Writer;
import org.mandarax.compiler.CompilerException;
import org.mandarax.compiler.Location;

/**
 * Simple location thats stores generated sources in a string.
 * @author jens dietrich
 */
class StringLocation implements Location {
	private StringWriter out = new StringWriter();
	@Override
	public Writer getSrcOut(String p,String c) throws CompilerException {
		return out;
	}

	public String getGeneratedCode() {
		return out.toString();
	}
}