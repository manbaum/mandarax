package test.org.mandarax.compiler.aggregation1;

import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Transaction</strong>.
 * Generated by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class TransactionRelInstances {
	// object references

	// fields representing annotations

	// rule: fact1: -> Transaction("Jens",42);
	private final static java.util.Properties _annotations_fact1 = new java.util.Properties();

	// rule: fact2: -> Transaction("Jens",80);
	private final static java.util.Properties _annotations_fact2 = new java.util.Properties();

	// rule: fact3: -> Transaction("Jens",99);
	private final static java.util.Properties _annotations_fact3 = new java.util.Properties();

	// rule: fact4: -> Transaction("Max",16);
	private final static java.util.Properties _annotations_fact4 = new java.util.Properties();

	// rule: fact5: -> Transaction("Max",20);
	private final static java.util.Properties _annotations_fact5 = new java.util.Properties();

	// rule: fact6: -> Transaction("Max",3);
	private final static java.util.Properties _annotations_fact6 = new java.util.Properties();

	// rule: fact7: -> Transaction("Yadi",1200);
	private final static java.util.Properties _annotations_fact7 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule fact1: -> Transaction("Jens",42);

		// rule annotations for rule fact1: -> Transaction("Jens",42);

		// relationship annotations for rule fact2: -> Transaction("Jens",80);

		// rule annotations for rule fact2: -> Transaction("Jens",80);

		// relationship annotations for rule fact3: -> Transaction("Jens",99);

		// rule annotations for rule fact3: -> Transaction("Jens",99);

		// relationship annotations for rule fact4: -> Transaction("Max",16);

		// rule annotations for rule fact4: -> Transaction("Max",16);

		// relationship annotations for rule fact5: -> Transaction("Max",20);

		// rule annotations for rule fact5: -> Transaction("Max",20);

		// relationship annotations for rule fact6: -> Transaction("Max",3);

		// rule annotations for rule fact6: -> Transaction("Max",3);

		// relationship annotations for rule fact7: -> Transaction("Yadi",1200);

		// rule annotations for rule fact7: -> Transaction("Yadi",1200);

	}

	// interface generated for queries

	public static ResultSet<TransactionRel> getTransactions(String customer) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<TransactionRel>(getTransactions(_derivation, customer), _derivation);
	}

	public static ResultSet<TransactionRel> getAll() {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<TransactionRel>(getAll(_derivation), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<TransactionRel> getTransactions(final DerivationController _derivation, final String customer) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<TransactionRel>(7) {

			public ResourceIterator<TransactionRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke fact1: -> Transaction("Jens",42);
					return getTransactions_0(_derivation.pop(_derivationlevel), customer);
				}

				case 1: {
					// invoke fact2: -> Transaction("Jens",80);
					return getTransactions_1(_derivation.pop(_derivationlevel), customer);
				}

				case 2: {
					// invoke fact3: -> Transaction("Jens",99);
					return getTransactions_2(_derivation.pop(_derivationlevel), customer);
				}

				case 3: {
					// invoke fact4: -> Transaction("Max",16);
					return getTransactions_3(_derivation.pop(_derivationlevel), customer);
				}

				case 4: {
					// invoke fact5: -> Transaction("Max",20);
					return getTransactions_4(_derivation.pop(_derivationlevel), customer);
				}

				case 5: {
					// invoke fact6: -> Transaction("Max",3);
					return getTransactions_5(_derivation.pop(_derivationlevel), customer);
				}

				case 6: {
					// invoke fact7: -> Transaction("Yadi",1200);
					return getTransactions_6(_derivation.pop(_derivationlevel), customer);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<TransactionRel> getAll(final DerivationController _derivation) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<TransactionRel>(7) {

			public ResourceIterator<TransactionRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke fact1: -> Transaction("Jens",42);
					return getAll_0(_derivation.pop(_derivationlevel));
				}

				case 1: {
					// invoke fact2: -> Transaction("Jens",80);
					return getAll_1(_derivation.pop(_derivationlevel));
				}

				case 2: {
					// invoke fact3: -> Transaction("Jens",99);
					return getAll_2(_derivation.pop(_derivationlevel));
				}

				case 3: {
					// invoke fact4: -> Transaction("Max",16);
					return getAll_3(_derivation.pop(_derivationlevel));
				}

				case 4: {
					// invoke fact5: -> Transaction("Max",20);
					return getAll_4(_derivation.pop(_derivationlevel));
				}

				case 5: {
					// invoke fact6: -> Transaction("Max",3);
					return getAll_5(_derivation.pop(_derivationlevel));
				}

				case 6: {
					// invoke fact7: -> Transaction("Yadi",1200);
					return getAll_6(_derivation.pop(_derivationlevel));
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: getTransactions
	// rule: fact1: -> Transaction("Jens",42);
	private static ResourceIterator<TransactionRel> getTransactions_0(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact1", DerivationController.RULE, _annotations_fact1);

		// utility class used to keep track of variables bindings
		// rule: fact1: -> Transaction("Jens",42);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Jens");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Jens", 42));

	}

	// rule: fact2: -> Transaction("Jens",80);
	private static ResourceIterator<TransactionRel> getTransactions_1(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact2", DerivationController.RULE, _annotations_fact2);

		// utility class used to keep track of variables bindings
		// rule: fact2: -> Transaction("Jens",80);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Jens");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Jens", 80));

	}

	// rule: fact3: -> Transaction("Jens",99);
	private static ResourceIterator<TransactionRel> getTransactions_2(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact3", DerivationController.RULE, _annotations_fact3);

		// utility class used to keep track of variables bindings
		// rule: fact3: -> Transaction("Jens",99);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Jens");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Jens", 99));

	}

	// rule: fact4: -> Transaction("Max",16);
	private static ResourceIterator<TransactionRel> getTransactions_3(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact4", DerivationController.RULE, _annotations_fact4);

		// utility class used to keep track of variables bindings
		// rule: fact4: -> Transaction("Max",16);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Max");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Max", 16));

	}

	// rule: fact5: -> Transaction("Max",20);
	private static ResourceIterator<TransactionRel> getTransactions_4(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact5", DerivationController.RULE, _annotations_fact5);

		// utility class used to keep track of variables bindings
		// rule: fact5: -> Transaction("Max",20);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Max");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Max", 20));

	}

	// rule: fact6: -> Transaction("Max",3);
	private static ResourceIterator<TransactionRel> getTransactions_5(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact6", DerivationController.RULE, _annotations_fact6);

		// utility class used to keep track of variables bindings
		// rule: fact6: -> Transaction("Max",3);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Max");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Max", 3));

	}

	// rule: fact7: -> Transaction("Yadi",1200);
	private static ResourceIterator<TransactionRel> getTransactions_6(final DerivationController _derivation, final String customer) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact7", DerivationController.RULE, _annotations_fact7);

		// utility class used to keep track of variables bindings
		// rule: fact7: -> Transaction("Yadi",1200);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(customer, "Yadi");

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new TransactionRel("Yadi", 1200));

	}

	// query: getAll
	// rule: fact1: -> Transaction("Jens",42);
	private static ResourceIterator<TransactionRel> getAll_0(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact1", DerivationController.RULE, _annotations_fact1);

		// utility class used to keep track of variables bindings
		// rule: fact1: -> Transaction("Jens",42);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Jens", 42));

	}

	// rule: fact2: -> Transaction("Jens",80);
	private static ResourceIterator<TransactionRel> getAll_1(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact2", DerivationController.RULE, _annotations_fact2);

		// utility class used to keep track of variables bindings
		// rule: fact2: -> Transaction("Jens",80);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Jens", 80));

	}

	// rule: fact3: -> Transaction("Jens",99);
	private static ResourceIterator<TransactionRel> getAll_2(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact3", DerivationController.RULE, _annotations_fact3);

		// utility class used to keep track of variables bindings
		// rule: fact3: -> Transaction("Jens",99);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Jens", 99));

	}

	// rule: fact4: -> Transaction("Max",16);
	private static ResourceIterator<TransactionRel> getAll_3(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact4", DerivationController.RULE, _annotations_fact4);

		// utility class used to keep track of variables bindings
		// rule: fact4: -> Transaction("Max",16);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Max", 16));

	}

	// rule: fact5: -> Transaction("Max",20);
	private static ResourceIterator<TransactionRel> getAll_4(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact5", DerivationController.RULE, _annotations_fact5);

		// utility class used to keep track of variables bindings
		// rule: fact5: -> Transaction("Max",20);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Max", 20));

	}

	// rule: fact6: -> Transaction("Max",3);
	private static ResourceIterator<TransactionRel> getAll_5(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact6", DerivationController.RULE, _annotations_fact6);

		// utility class used to keep track of variables bindings
		// rule: fact6: -> Transaction("Max",3);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Max", 3));

	}

	// rule: fact7: -> Transaction("Yadi",1200);
	private static ResourceIterator<TransactionRel> getAll_6(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.aggregation1.Transaction.fact7", DerivationController.RULE, _annotations_fact7);

		// utility class used to keep track of variables bindings
		// rule: fact7: -> Transaction("Yadi",1200);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new TransactionRel("Yadi", 1200));

	}

	// methods representing aggregation functions

}
