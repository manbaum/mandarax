package test.org.mandarax.compiler.aggregation1;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>Transaction</strong>. Generated
 * by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class TransactionRel {

	// fields created for slots
	public String customer = null;
	public int value = 0;

	// constructors
	public TransactionRel() {
		super();
	}

	public TransactionRel(String customer, int value) {
		super();
		this.customer = customer;
		this.value = value;

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
		TransactionRel _tmp = (TransactionRel) obj;
		return new EqualsBuilder().append(customer, _tmp.customer).append(value, _tmp.value).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(customer).append(value).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("customer", customer).append("value", value).toString();
	}

}
