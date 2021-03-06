package test.org.mandarax.compiler.naf1;

import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Orphan</strong>. Generated by
 * org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class OrphanRelInstances {
	// object references

	public static Person m1 = new Person("m1", 25);

	public static Person m2 = new Person("m2", 5);

	public static Person m3 = new Person("m3", 5);

	public static Person f1 = new Person("f1", 25);

	// fields representing annotations

	// rule: rule1: isYoung(p) & not Father(f,p) & not Mother(m,p) -> Orphan(p);
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule rule1: isYoung(p) & not Father(f,p)
		// & not Mother(m,p) -> Orphan(p);

		// rule annotations for rule rule1: isYoung(p) & not Father(f,p) & not
		// Mother(m,p) -> Orphan(p);

	}

	// interface generated for queries

	public static ResultSet<OrphanRel> isOrphan(Person person) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<OrphanRel>(isOrphan(_derivation, person), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<OrphanRel> isOrphan(final DerivationController _derivation, final Person person) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<OrphanRel>(1) {

			public ResourceIterator<OrphanRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: isYoung(p) & not Father(f,p) & not
					// Mother(m,p) -> Orphan(p);
					return isOrphan_0(_derivation.pop(_derivationlevel), person);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: isOrphan
	// rule: rule1: isYoung(p) & not Father(f,p) & not Mother(m,p) -> Orphan(p);
	private static ResourceIterator<OrphanRel> isOrphan_0(final DerivationController _derivation, final Person person) {

		_derivation.log("test.org.mandarax.compiler.naf1.Orphan.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: isYoung(p) & not Father(f,p) & not Mother(m,p) ->
		// Orphan(p);
		// prereqs: [isYoung(p), not Father(f,p), not Mother(m,p)]
		class _Bindings {
			private test.org.mandarax.compiler.Person p = person;
			private test.org.mandarax.compiler.Person f = null;
			private test.org.mandarax.compiler.Person m = null;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite isYoung(p)

		// case 4

		_tmp = isYoungRelInstances.isYoung(_derivation.push(), _bindings.p);

		if (!_tmp.hasNext()) {
			_tmp.close();
			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite not Father(f,p)

		// case 4

		_tmp = FatherRelInstances.getFather(_derivation.push(), _bindings.p);

		if (_tmp.hasNext()) {
			_tmp.close();
			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite not Mother(m,p)

		// case 4

		_tmp = MotherRelInstances.getMother(_derivation.push(), _bindings.p);

		if (_tmp.hasNext()) {
			_tmp.close();
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new OrphanRel(_bindings.p));

	}

	// methods representing aggregation functions

}
