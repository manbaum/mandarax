package test.org.mandarax.compiler.externalfacts2;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Father</strong>. Generated by
 * org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class FatherRelInstances {
	// object references

	// fields representing annotations

	// rule: factset1: include new
	// test.org.mandarax.compiler.FatherRelRecords2()
	private final static java.util.Properties _annotations_factset1 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule factset1: include new
		// test.org.mandarax.compiler.FatherRelRecords2()

		// rule annotations for rule factset1: include new
		// test.org.mandarax.compiler.FatherRelRecords2()

	}

	// interface generated for queries

	public static ResultSet<FatherRel> getFather(String child) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getFather(_derivation, child), _derivation);
	}

	public static ResultSet<FatherRel> isFather(String father, String child) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(isFather(_derivation, father, child), _derivation);
	}

	public static ResultSet<FatherRel> getChildren(String father) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getChildren(_derivation, father), _derivation);
	}

	public static ResultSet<FatherRel> getFatherAndChild() {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<FatherRel>(getFatherAndChild(_derivation), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<FatherRel> getFather(final DerivationController _derivation, final String child) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {

			public ResourceIterator<FatherRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke factset1: include new
					// test.org.mandarax.compiler.FatherRelRecords2()
					return getFather_0(_derivation.pop(_derivationlevel), child);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<FatherRel> isFather(final DerivationController _derivation, final String father, final String child) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {

			public ResourceIterator<FatherRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke factset1: include new
					// test.org.mandarax.compiler.FatherRelRecords2()
					return isFather_0(_derivation.pop(_derivationlevel), father, child);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<FatherRel> getChildren(final DerivationController _derivation, final String father) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {

			public ResourceIterator<FatherRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke factset1: include new
					// test.org.mandarax.compiler.FatherRelRecords2()
					return getChildren_0(_derivation.pop(_derivationlevel), father);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<FatherRel> getFatherAndChild(final DerivationController _derivation) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<FatherRel>(1) {

			public ResourceIterator<FatherRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke factset1: include new
					// test.org.mandarax.compiler.FatherRelRecords2()
					return getFatherAndChild_0(_derivation.pop(_derivationlevel));
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: getFather
	// rule: factset1: include new
	// test.org.mandarax.compiler.FatherRelRecords2()
	private static ResourceIterator<FatherRel> getFather_0(final DerivationController _derivation, final String child) {

		_derivation.log("test.org.mandarax.compiler.externalfacts2.Father.factset1", DerivationController.EXTERNAL, _annotations_factset1);

		// optimised code: invoke method public java.util.Iterator
		// test.org.mandarax.compiler.FatherRelRecords2.getFather(java.lang.String)
		java.util.Iterator<FatherRel> _iter = new test.org.mandarax.compiler.FatherRelRecords2().getFather(child);
		org.mandarax.rt.ResourceIterator<FatherRel> _resIter = (_iter instanceof org.mandarax.rt.ResourceIterator) ? (org.mandarax.rt.ResourceIterator<FatherRel>) _iter
				: new org.mandarax.rt.NonClosableResourceIterator<FatherRel>(_iter);
		return _resIter;

	}

	// query: isFather
	// rule: factset1: include new
	// test.org.mandarax.compiler.FatherRelRecords2()
	private static ResourceIterator<FatherRel> isFather_0(final DerivationController _derivation, final String father, final String child) {

		_derivation.log("test.org.mandarax.compiler.externalfacts2.Father.factset1", DerivationController.EXTERNAL, _annotations_factset1);

		// optimised code: invoke method public java.util.Iterator
		// test.org.mandarax.compiler.FatherRelRecords2.isFather(java.lang.String,java.lang.String)
		java.util.Iterator<FatherRel> _iter = new test.org.mandarax.compiler.FatherRelRecords2().isFather(father, child);
		org.mandarax.rt.ResourceIterator<FatherRel> _resIter = (_iter instanceof org.mandarax.rt.ResourceIterator) ? (org.mandarax.rt.ResourceIterator<FatherRel>) _iter
				: new org.mandarax.rt.NonClosableResourceIterator<FatherRel>(_iter);
		return _resIter;

	}

	// query: getChildren
	// rule: factset1: include new
	// test.org.mandarax.compiler.FatherRelRecords2()
	private static ResourceIterator<FatherRel> getChildren_0(final DerivationController _derivation, final String father) {

		_derivation.log("test.org.mandarax.compiler.externalfacts2.Father.factset1", DerivationController.EXTERNAL, _annotations_factset1);

		java.util.Iterator<FatherRel> _iter = new test.org.mandarax.compiler.FatherRelRecords2().iterator();
		org.mandarax.rt.ResourceIterator<FatherRel> _resIter = (_iter instanceof org.mandarax.rt.ResourceIterator) ? (org.mandarax.rt.ResourceIterator<FatherRel>) _iter
				: new org.mandarax.rt.NonClosableResourceIterator<FatherRel>(_iter);

		com.google.common.base.Predicate<FatherRel> _filter = new com.google.common.base.Predicate<FatherRel>() {
			@Override
			public boolean apply(FatherRel _obj) {
				boolean _t = true;
				_t = _t && Equals.compare(father, _obj.father);

				return _t;
			}
		};
		return new org.mandarax.rt.FilteredIterator(_resIter, _filter);

	}

	// query: getFatherAndChild
	// rule: factset1: include new
	// test.org.mandarax.compiler.FatherRelRecords2()
	private static ResourceIterator<FatherRel> getFatherAndChild_0(final DerivationController _derivation) {

		_derivation.log("test.org.mandarax.compiler.externalfacts2.Father.factset1", DerivationController.EXTERNAL, _annotations_factset1);

		java.util.Iterator<FatherRel> _iter = new test.org.mandarax.compiler.FatherRelRecords2().iterator();
		org.mandarax.rt.ResourceIterator<FatherRel> _resIter = (_iter instanceof org.mandarax.rt.ResourceIterator) ? (org.mandarax.rt.ResourceIterator<FatherRel>) _iter
				: new org.mandarax.rt.NonClosableResourceIterator<FatherRel>(_iter);

		com.google.common.base.Predicate<FatherRel> _filter = new com.google.common.base.Predicate<FatherRel>() {
			@Override
			public boolean apply(FatherRel _obj) {
				boolean _t = true;

				return _t;
			}
		};
		return new org.mandarax.rt.FilteredIterator(_resIter, _filter);

	}

	// methods representing aggregation functions

}