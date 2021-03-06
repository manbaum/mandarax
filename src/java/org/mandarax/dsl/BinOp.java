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

package org.mandarax.dsl;

/**
 * Enumeration of binary operators/connectives.
 * @author jens dietrich
 */

public enum BinOp {
	OR,AND,EQ,NEQ,LT,GT,LTE,GTE,SHIFT_RRR,SHIFT_RR,SHIFT_LL,PLUS,MINUS,TIMES,MOD,DIV
}
