package test.org.mandarax.compiler.indomain1;

import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Discount</strong>. Generated
 * by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class DiscountRelInstances {
	// object references

	public static java.util.List specialCustomers = new java.util.ArrayList();

	public static test.org.mandarax.compiler.Discount specialDiscount = new test.org.mandarax.compiler.Discount(5, false);

	// fields representing annotations

	// rule: rule1: _InDomain(c,specialCustomers) ->
	// Discount(c,specialDiscount);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule rule1:
		// _InDomain(c,specialCustomers) -> Discount(c,specialDiscount);

		// rule annotations for rule rule1: _InDomain(c,specialCustomers) ->
		// Discount(c,specialDiscount);

	}

	// interface generated for queries

	public static ResultSet<DiscountRel> getAll() {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<DiscountRel>(getAll(_derivation), _derivation);
	}

	public static ResultSet<DiscountRel> getDiscount(Customer customer) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<DiscountRel>(getDiscount(_derivation, customer), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<DiscountRel> getAll(final DerivationController _derivation) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<DiscountRel>(1) {

			public ResourceIterator<DiscountRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: _InDomain(c,specialCustomers) ->
					// Discount(c,specialDiscount);
					return getAll_0(_derivation.pop(_derivationlevel));
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<DiscountRel> getDiscount(final DerivationController _derivation, final Customer customer) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<DiscountRel>(1) {

			public ResourceIterator<DiscountRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: _InDomain(c,specialCustomers) ->
					// Discount(c,specialDiscount);
					return getDiscount_0(_derivation.pop(_derivationlevel), customer);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: getAll
	// rule: rule1: _InDomain(c,specialCustomers) ->
	// Discount(c,specialDiscount);
	private static ResourceIterator<DiscountRel> getAll_0(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.indomain1.Discount.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: _InDomain(c,specialCustomers) ->
		// Discount(c,specialDiscount);
		// prereqs: [_InDomain(c,specialCustomers)]
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = null;
			private test.org.mandarax.compiler.Discount specialDiscount = DiscountRelInstances.specialDiscount;
			private java.util.List specialCustomers = DiscountRelInstances.specialCustomers;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite _InDomain(c,specialCustomers)

		// case 1
		final ResourceIterator<_InDomainRel> _iterator2 = _InDomainRelInstances.getElements(_derivation.push(), _bindings.specialCustomers);

		// rule head

		return new NestedIterator<_InDomainRel, DiscountRel>(_iterator2) {
			public ResourceIterator<DiscountRel> getNextIterator(_InDomainRel _object) {
				// bind parameters from _InDomain(c,specialCustomers)
				_bindings.c = (test.org.mandarax.compiler.Customer) _object.element;

				return new SingletonIterator(new DiscountRel(_bindings.c, _bindings.specialDiscount));
			}
		};

	}

	// query: getDiscount
	// rule: rule1: _InDomain(c,specialCustomers) ->
	// Discount(c,specialDiscount);
	private static ResourceIterator<DiscountRel> getDiscount_0(final DerivationController _derivation, final Customer customer) {

		_derivation.log("test.org.mandarax.compiler.indomain1.Discount.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: _InDomain(c,specialCustomers) ->
		// Discount(c,specialDiscount);
		// prereqs: [_InDomain(c,specialCustomers)]
		class _Bindings {
			private test.org.mandarax.compiler.Customer c = customer;
			private test.org.mandarax.compiler.Discount specialDiscount = DiscountRelInstances.specialDiscount;
			private java.util.List specialCustomers = DiscountRelInstances.specialCustomers;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite _InDomain(c,specialCustomers)

		// case 4

		_tmp = _InDomainRelInstances.contains(_derivation.push(), _bindings.specialCustomers, _bindings.c);

		if (!_tmp.hasNext()) {
			_tmp.close();
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new DiscountRel(_bindings.c, _bindings.specialDiscount));

	}

	// methods representing aggregation functions

}
