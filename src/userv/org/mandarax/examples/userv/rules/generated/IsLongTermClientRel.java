package org.mandarax.examples.userv.rules.generated;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mandarax.examples.userv.domain.*;

/**
 * Class representing the relationship <strong>IsLongTermClient</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * @version Dec 2, 2010 1:53:24 PM 
 */
public class IsLongTermClientRel {

	// fields created for slots 
	public Driver client = null;
	
	// constructors
	public IsLongTermClientRel () {
		super();
	}
	
	public IsLongTermClientRel ( Driver client ) {
		super();
		this.client=client; 
		
	}

	// standard methods
	@Override
	public boolean equals(Object obj) {
   		if (obj == null) { return false; }
   		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
   		IsLongTermClientRel _tmp = (IsLongTermClientRel) obj;
   		return new EqualsBuilder()
            .append(client, _tmp.client)
            .isEquals();
  	}
  
  	@Override
   	public int hashCode() {
    	return new HashCodeBuilder(17, 37)
        	.append(client)
            .toHashCode();
   	}
   	@Override
   	public String toString() {
    	return new ToStringBuilder(this)
    		.append("client",client)
    		.toString();
   }
   

}

