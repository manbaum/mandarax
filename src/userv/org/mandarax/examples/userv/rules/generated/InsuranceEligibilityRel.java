package org.mandarax.examples.userv.rules.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>InsuranceEligibility</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Nov 23, 2010 11:18:35 PM
 */
public class InsuranceEligibilityRel {

	// fields created for slots
	public Car car = null;
	public Driver client = null;
	public String eligibility = null;

	// constructors
	public InsuranceEligibilityRel() {
		super();
	}

	public InsuranceEligibilityRel(Car car, Driver client, String eligibility) {
		super();
		this.car = car;
		this.client = client;
		this.eligibility = eligibility;

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
		InsuranceEligibilityRel _tmp = (InsuranceEligibilityRel) obj;
		return new EqualsBuilder().append(car, _tmp.car).append(client, _tmp.client).append(eligibility, _tmp.eligibility).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(car).append(client).append(eligibility).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("car", car).append("client", client).append("eligibility", eligibility).toString();
	}

}