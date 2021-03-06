package test.org.mandarax.compiler.reldefStaticMethods2;

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

	// rule: rule1: y==(factorial(x)) -> Factorial(x,y);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule rule1: y==(factorial(x)) ->
		// Factorial(x,y);

		// rule annotations for rule rule1: y==(factorial(x)) -> Factorial(x,y);

	}

	// interface generated for queries

	public static ResultSet<FactorialRel> isFactorial(int n, int fact) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FactorialRel>(isFactorial(_derivation, n, fact), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<FactorialRel> isFactorial(final DerivationController _derivation, final int n, final int fact) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FactorialRel>(1) {

			public ResourceIterator<FactorialRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: y==(factorial(x)) -> Factorial(x,y);
					return isFactorial_0(_derivation.pop(_derivationlevel), n, fact);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: isFactorial
	// rule: rule1: y==(factorial(x)) -> Factorial(x,y);
	private static ResourceIterator<FactorialRel> isFactorial_0(final DerivationController _derivation, final int n, final int fact) {

		_derivation.log("test.org.mandarax.compiler.reldefStaticMethods2.Factorial.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: y==(factorial(x)) -> Factorial(x,y);
		// prereqs: [y==(factorial(x))]
		class _Bindings {
			private int x = n;
			private int y = fact;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite y==(factorial(x))

		// case 4
		if (!(org.mandarax.rt.Equals.compare(_bindings.y, test.org.mandarax.compiler.Functions4Testing.factorial(_bindings.x)))) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new FactorialRel(_bindings.x, _bindings.y));

	}

	// methods representing aggregation functions

}
