package test.org.mandarax.compiler.reldef7;
 
import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Discount</strong>.
 * @version Oct 29, 2010 2:37:45 PM 
 */
public class DiscountRelInstances {
	// object references
	 
	public static test.org.mandarax.compiler.Discount goldDiscount = new test.org.mandarax.compiler.Discount(20,true);
	 
	public static test.org.mandarax.compiler.Discount silverDiscount = new test.org.mandarax.compiler.Discount(10,true);
	 
	public static test.org.mandarax.compiler.Discount specialDiscount = new test.org.mandarax.compiler.Discount(5,false);
	
	
	// fields representing annotations
	
	// rule: rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();
	
	// rule: rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
	private final static java.util.Properties _annotations_rule2 = new java.util.Properties();
	
	// rule: rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
	private final static java.util.Properties _annotations_rule3 = new java.util.Properties();
	
	
	// initialise annotations
	static {
		// relationship annotations for rule  rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
		_annotations_rule1.put("author","jens");
		_annotations_rule1.put("lastupdated","26/10/10");
		
		// rule annotations for rule  rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
		_annotations_rule1.put("lastupdated","27/10/10");
		_annotations_rule1.put("name","golden rule");
		
		
	
		// relationship annotations for rule  rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
		_annotations_rule2.put("author","jens");
		_annotations_rule2.put("lastupdated","26/10/10");
		
		// rule annotations for rule  rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
		_annotations_rule2.put("name","\\\"silver\\\" rule");
		
		
	
		// relationship annotations for rule  rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
		_annotations_rule3.put("author","jens");
		_annotations_rule3.put("lastupdated","26/10/10");
		
		// rule annotations for rule  rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
		_annotations_rule3.put("name","special rule");
		
		
	}
		
	

	// interface generated for queries	
	 
	public ResultSet<DiscountRel> getDiscount (  Customer customer  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<DiscountRel>(getDiscount ( _derivation ,  customer ),_derivation);
	} 
	 
	public ResultSet<DiscountRel> qualifiesForDiscount (  Customer customer ,  Discount discount  ) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<DiscountRel>(qualifiesForDiscount ( _derivation ,  customer ,  discount ),_derivation);
	} 
	
	
	// implementations - these methods are referenced by code generated from other rules in this package
	// and therefore kept static 
	 
	static ResourceIterator<DiscountRel> getDiscount ( final DerivationController _derivation ,  final Customer customer  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<DiscountRel>(3) {
			
			public ResourceIterator<DiscountRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
                			return getDiscount_0(_derivation.pop(_derivationlevel) ,  customer );
                		}
				
                		case 1: {
                			// invoke rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
                			return getDiscount_1(_derivation.pop(_derivationlevel) ,  customer );
                		}
				
                		case 2: {
                			// invoke rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
                			return getDiscount_2(_derivation.pop(_derivationlevel) ,  customer );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	 
	static ResourceIterator<DiscountRel> qualifiesForDiscount ( final DerivationController _derivation ,  final Customer customer ,  final Discount discount  ) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<DiscountRel>(3) {
			
			public ResourceIterator<DiscountRel> getNextIterator(int pos) {
			switch (pos) {
				
                		case 0: {
                			// invoke rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
                			return qualifiesForDiscount_0(_derivation.pop(_derivationlevel) ,  customer ,  discount );
                		}
				
                		case 1: {
                			// invoke rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
                			return qualifiesForDiscount_1(_derivation.pop(_derivationlevel) ,  customer ,  discount );
                		}
				
                		case 2: {
                			// invoke rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
                			return qualifiesForDiscount_2(_derivation.pop(_derivationlevel) ,  customer ,  discount );
                		}
				
				default: return EmptyIterator.DEFAULT;
			}}
		};
	} 
	
	
	
	// private methods - each method represents the invocation of a single rule for a certain query
	// query: getDiscount
	// rule: rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
	private static ResourceIterator<DiscountRel> getDiscount_0 (final DerivationController _derivation ,  final Customer customer ) {
		
		_derivation.log("Discount.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer; // term c
			private test.org.mandarax.compiler.Discount goldDiscount = DiscountRelInstances.goldDiscount; // term goldDiscount
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite (c.getTurnover())>1000
		 
					if (!((_bindings.c.getTurnover())>1000)) {return EmptyIterator.DEFAULT;} 
		
		
		// rule head
		return new SingletonIterator(new DiscountRel(_bindings.c,_bindings.goldDiscount));
        
		
		
		
	

		
	}
	// rule: rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
	private static ResourceIterator<DiscountRel> getDiscount_1 (final DerivationController _derivation ,  final Customer customer ) {
		
		_derivation.log("Discount.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer; // term c
			private test.org.mandarax.compiler.Discount silverDiscount = DiscountRelInstances.silverDiscount; // term silverDiscount
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite FrequentCustomer(c)
		final ResourceIterator<FrequentCustomerRel> iterator1 = FrequentCustomerRelInstances.isFrequentCustomer(_derivation.push(),_bindings.c);
		
		
		
		
		// rule head
		return new NestedIterator<FrequentCustomerRel, DiscountRel>(iterator1) {
                	public ResourceIterator<DiscountRel> getNextIterator(FrequentCustomerRel _object) {
						// bind parameters from FrequentCustomer(c)
						
                    				return new SingletonIterator(new DiscountRel(_bindings.c,_bindings.silverDiscount));
                	}
        	};
        
		
		
		
	

		
	}
	// rule: rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
	private static ResourceIterator<DiscountRel> getDiscount_2 (final DerivationController _derivation ,  final Customer customer ) {
		
		_derivation.log("Discount.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer; // term c
			private test.org.mandarax.compiler.Discount specialDiscount = DiscountRelInstances.specialDiscount; // term specialDiscount
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite (c.getPaymentMethod())=="CompanyVisa"
		 
					if (!(org.mandarax.rt.Equals.compare(_bindings.c.getPaymentMethod(),"CompanyVisa"))) {return EmptyIterator.DEFAULT;} 
		
		
		// rule head
		return new SingletonIterator(new DiscountRel(_bindings.c,_bindings.specialDiscount));
        
		
		
		
	

		
	}
	// query: qualifiesForDiscount
	// rule: rule1: (c.getTurnover())>1000 -> Discount(c,goldDiscount);
	private static ResourceIterator<DiscountRel> qualifiesForDiscount_0 (final DerivationController _derivation ,  final Customer customer ,  final Discount discount ) {
		
		_derivation.log("Discount.rule1", DerivationController.RULE, _annotations_rule1);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer; // term c
			private test.org.mandarax.compiler.Discount goldDiscount = DiscountRelInstances.goldDiscount; // term goldDiscount
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite (c.getTurnover())>1000
		 
					if (!((_bindings.c.getTurnover())>1000)) {return EmptyIterator.DEFAULT;} 
		
		
		// rule head
		return new SingletonIterator(new DiscountRel(_bindings.c,_bindings.goldDiscount));
        
		
		
		
	

		
	}
	// rule: rule2: FrequentCustomer(c) -> Discount(c,silverDiscount);
	private static ResourceIterator<DiscountRel> qualifiesForDiscount_1 (final DerivationController _derivation ,  final Customer customer ,  final Discount discount ) {
		
		_derivation.log("Discount.rule2", DerivationController.RULE, _annotations_rule2);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer; // term c
			private test.org.mandarax.compiler.Discount silverDiscount = DiscountRelInstances.silverDiscount; // term silverDiscount
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite FrequentCustomer(c)
		final ResourceIterator<FrequentCustomerRel> iterator1 = FrequentCustomerRelInstances.isFrequentCustomer(_derivation.push(),_bindings.c);
		
		
		
		
		// rule head
		return new NestedIterator<FrequentCustomerRel, DiscountRel>(iterator1) {
                	public ResourceIterator<DiscountRel> getNextIterator(FrequentCustomerRel _object) {
						// bind parameters from FrequentCustomer(c)
						
                    				return new SingletonIterator(new DiscountRel(_bindings.c,_bindings.silverDiscount));
                	}
        	};
        
		
		
		
	

		
	}
	// rule: rule3: (c.getPaymentMethod())=="CompanyVisa" -> Discount(c,specialDiscount);
	private static ResourceIterator<DiscountRel> qualifiesForDiscount_2 (final DerivationController _derivation ,  final Customer customer ,  final Discount discount ) {
		
		_derivation.log("Discount.rule3", DerivationController.RULE, _annotations_rule3);
		
			
	
		
		// utility class used to keep track of variables bindings
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer; // term c
			private test.org.mandarax.compiler.Discount specialDiscount = DiscountRelInstances.specialDiscount; // term specialDiscount
		}
		final _Bindings _bindings = new _Bindings();
		

		 
		// apply prerequisite (c.getPaymentMethod())=="CompanyVisa"
		 
					if (!(org.mandarax.rt.Equals.compare(_bindings.c.getPaymentMethod(),"CompanyVisa"))) {return EmptyIterator.DEFAULT;} 
		
		
		// rule head
		return new SingletonIterator(new DiscountRel(_bindings.c,_bindings.specialDiscount));
        
		
		
		
	

		
	}
	
	
}
