package test.org.mandarax.compiler.reldef14;
 
import test.org.mandarax.compiler.*;

/**
 * Class representing the relationship <strong>Father</strong>.
 * @version Nov 8, 2010 11:46:00 AM 
 */
public class FatherRel {

	// constructors
	public FatherRel () {
		super();
	}
	
	public FatherRel ( Person father , Person child ) {
		super();
		this.father=father; 
		this.child=child; 
		
	}

	// instance variables created for slots
	 
	public Person father = null; 
	 
	public Person child = null; 
	

}
