package test.org.mandarax.compiler.factorial;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Factorial</strong>. Generated
 * by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class FactorialRelInstances {
	// object references

	// fields representing annotations

	// rule: rule1: -> Factorial(0,1);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();

	// rule: rule2: Factorial(x-1,n) -> Factorial(x,n*x);
	private final static java.util.Properties _annotations_rule2 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule rule1: -> Factorial(0,1);

		// rule annotations for rule rule1: -> Factorial(0,1);

		// relationship annotations for rule rule2: Factorial(x-1,n) ->
		// Factorial(x,n*x);

		// rule annotations for rule rule2: Factorial(x-1,n) ->
		// Factorial(x,n*x);

	}

	// interface generated for queries

	public static ResultSet<FactorialRel> getFactorial(int i) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FactorialRel>(getFactorial(_derivation, i), _derivation);
	}

	public static ResultSet<FactorialRel> isFactorial(int i, int f) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FactorialRel>(isFactorial(_derivation, i, f), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<FactorialRel> getFactorial(final DerivationController _derivation, final int i) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FactorialRel>(2) {

			public ResourceIterator<FactorialRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: -> Factorial(0,1);
					return getFactorial_0(_derivation.pop(_derivationlevel), i);
				}

				case 1: {
					// invoke rule2: Factorial(x-1,n) -> Factorial(x,n*x);
					return getFactorial_1(_derivation.pop(_derivationlevel), i);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<FactorialRel> isFactorial(final DerivationController _derivation, final int i, final int f) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FactorialRel>(2) {

			public ResourceIterator<FactorialRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: -> Factorial(0,1);
					return isFactorial_0(_derivation.pop(_derivationlevel), i, f);
				}

				case 1: {
					// invoke rule2: Factorial(x-1,n) -> Factorial(x,n*x);
					return isFactorial_1(_derivation.pop(_derivationlevel), i, f);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: getFactorial
	// rule: rule1: -> Factorial(0,1);
	private static ResourceIterator<FactorialRel> getFactorial_0(final DerivationController _derivation, final int i) {

		_derivation.log("test.org.mandarax.compiler.factorial.Factorial.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: -> Factorial(0,1);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(i, 0);

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new FactorialRel(0, 1));

	}

	// rule: rule2: Factorial(x-1,n) -> Factorial(x,n*x);
	private static ResourceIterator<FactorialRel> getFactorial_1(final DerivationController _derivation, final int i) {

		_derivation.log("test.org.mandarax.compiler.factorial.Factorial.rule2", DerivationController.RULE, _annotations_rule2);

		// utility class used to keep track of variables bindings
		// rule: rule2: Factorial(x-1,n) -> Factorial(x,n*x);
		// prereqs: [Factorial(x-1,n)]
		class _Bindings {
			private int x = i;
			private int n = 0;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite Factorial(x-1,n)

		// case 1
		final ResourceIterator<FactorialRel> _iterator2 = FactorialRelInstances.getFactorial(_derivation.push(), _bindings.x - 1);

		// rule head

		return new NestedIterator<FactorialRel, FactorialRel>(_iterator2) {
			public ResourceIterator<FactorialRel> getNextIterator(FactorialRel _object) {
				// bind parameters from Factorial(x-1,n)
				_bindings.n = _object.f;

				return new SingletonIterator(new FactorialRel(_bindings.x, _bindings.n * _bindings.x));
			}
		};

	}

	// query: isFactorial
	// rule: rule1: -> Factorial(0,1);
	private static ResourceIterator<FactorialRel> isFactorial_0(final DerivationController _derivation, final int i, final int f) {

		_derivation.log("test.org.mandarax.compiler.factorial.Factorial.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: -> Factorial(0,1);
		// prereqs: []
		class _Bindings {
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// check conditions
		boolean _checkfailed = false;

		_checkfailed = _checkfailed || !Equals.compare(i, 0);

		_checkfailed = _checkfailed || !Equals.compare(f, 1);

		if (_checkfailed) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new FactorialRel(0, 1));

	}

	// rule: rule2: Factorial(x-1,n) -> Factorial(x,n*x);
	private static ResourceIterator<FactorialRel> isFactorial_1(final DerivationController _derivation, final int i, final int f) {

		_derivation.log("test.org.mandarax.compiler.factorial.Factorial.rule2", DerivationController.RULE, _annotations_rule2);

		// utility class used to keep track of variables bindings
		// rule: rule2: Factorial(x-1,n) & __t0==(n*x) -> Factorial(x,__t0);
		// prereqs: [Factorial(x-1,n), __t0==(n*x)]
		class _Bindings {
			private int x = i;
			private int __t0 = f;
			private int n = 0;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite Factorial(x-1,n)

		// case 1
		final ResourceIterator<FactorialRel> _iterator2 = FactorialRelInstances.getFactorial(_derivation.push(), _bindings.x - 1);

		// apply prerequisite __t0==(n*x)

		// case 3

		com.google.common.base.Predicate<FactorialRel> _filter3 = new com.google.common.base.Predicate<FactorialRel>() {
			public boolean apply(FactorialRel _object) {
				// bind parameters from Factorial(x-1,n)
				_bindings.n = _object.f;

				return org.mandarax.rt.Equals.compare(_bindings.__t0, _bindings.n * _bindings.x);

			}
		};
		final ResourceIterator<FactorialRel> _iterator3 = new FilteredIterator<FactorialRel>(_iterator2, _filter3);

		// rule head

		return new NestedIterator<FactorialRel, FactorialRel>(_iterator3) {
			public ResourceIterator<FactorialRel> getNextIterator(FactorialRel _object) {
				// bind parameters from Factorial(x-1,n)
				_bindings.n = _object.f;

				return new SingletonIterator(new FactorialRel(_bindings.x, _bindings.__t0));
			}
		};

	}

	// methods representing aggregation functions

}
