package test.org.mandarax.compiler.reldef14;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>HasName</strong>. Generated by
 * org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class HasNameRel {

	// fields created for slots
	public Person person = null;
	public String name = null;

	// constructors
	public HasNameRel() {
		super();
	}

	public HasNameRel(Person person, String name) {
		super();
		this.person = person;
		this.name = name;

	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		HasNameRel _tmp = (HasNameRel) obj;
		return new EqualsBuilder().append(person, _tmp.person).append(name, _tmp.name).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(person).append(name).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("person", person).append("name", name).toString();
	}

}
