package test.org.mandarax.compiler.rlist;

import test.org.mandarax.compiler.*;

import org.mandarax.rt.*;

/**
 * Interface for queries for relationship <strong>Contains</strong>. Generated
 * by org.mandarax.compiler.impl.DefaultCompiler.
 * 
 * @version Jan 16, 2011 9:27:45 PM
 */
public class ContainsRelInstances {
	// object references

	// fields representing annotations

	// rule: rule1: -> Contains(_list,_list.getHead());
	private final static java.util.Properties _annotations_rule1 = new java.util.Properties();

	// rule: rule2: (_list.getTail())!=null & Contains(_list.getTail(),_element)
	// -> Contains(_list,_element);
	private final static java.util.Properties _annotations_rule2 = new java.util.Properties();

	// initialise annotations
	static {
		// relationship annotations for rule rule1: ->
		// Contains(_list,_list.getHead());

		// rule annotations for rule rule1: -> Contains(_list,_list.getHead());

		// relationship annotations for rule rule2: (_list.getTail())!=null &
		// Contains(_list.getTail(),_element) -> Contains(_list,_element);

		// rule annotations for rule rule2: (_list.getTail())!=null &
		// Contains(_list.getTail(),_element) -> Contains(_list,_element);

	}

	// interface generated for queries

	public static ResultSet<ContainsRel> contains(RList list, Object element) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<ContainsRel>(contains(_derivation, list, element), _derivation);
	}

	public static ResultSet<ContainsRel> getElements(RList list) {
		DerivationController _derivation = new DefaultDerivationController();
		return new ResultSet<ContainsRel>(getElements(_derivation, list), _derivation);
	}

	// implementations - these methods are referenced by code generated from
	// other rules in this package
	// and therefore kept static

	static ResourceIterator<ContainsRel> contains(final DerivationController _derivation, final RList list, final Object element) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<ContainsRel>(2) {

			public ResourceIterator<ContainsRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: -> Contains(_list,_list.getHead());
					return contains_0(_derivation.pop(_derivationlevel), list, element);
				}

				case 1: {
					// invoke rule2: (_list.getTail())!=null &
					// Contains(_list.getTail(),_element) ->
					// Contains(_list,_element);
					return contains_1(_derivation.pop(_derivationlevel), list, element);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	static ResourceIterator<ContainsRel> getElements(final DerivationController _derivation, final RList list) {
		final int _derivationlevel = _derivation.size();
		return new IteratorChain<ContainsRel>(2) {

			public ResourceIterator<ContainsRel> getNextIterator(int pos) {
				switch (pos) {

				case 0: {
					// invoke rule1: -> Contains(_list,_list.getHead());
					return getElements_0(_derivation.pop(_derivationlevel), list);
				}

				case 1: {
					// invoke rule2: (_list.getTail())!=null &
					// Contains(_list.getTail(),_element) ->
					// Contains(_list,_element);
					return getElements_1(_derivation.pop(_derivationlevel), list);
				}

				default:
					return EmptyIterator.DEFAULT;
				}
			}
		};
	}

	// private methods - each method represents the invocation of a single rule
	// for a certain query
	// query: contains
	// rule: rule1: -> Contains(_list,_list.getHead());
	private static ResourceIterator<ContainsRel> contains_0(final DerivationController _derivation, final RList list, final Object element) {

		_derivation.log("test.org.mandarax.compiler.rlist.Contains.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: __t0==(_list.getHead()) -> Contains(_list,__t0);
		// prereqs: [__t0==(_list.getHead())]
		class _Bindings {
			private test.org.mandarax.compiler.RList _list = list;
			private java.lang.Object __t0 = element;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite __t0==(_list.getHead())

		// case 4
		if (!(org.mandarax.rt.Equals.compare(_bindings.__t0, _bindings._list.getHead()))) {
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new ContainsRel(_bindings._list, _bindings.__t0));

	}

	// rule: rule2: (_list.getTail())!=null & Contains(_list.getTail(),_element)
	// -> Contains(_list,_element);
	private static ResourceIterator<ContainsRel> contains_1(final DerivationController _derivation, final RList list, final Object element) {

		_derivation.log("test.org.mandarax.compiler.rlist.Contains.rule2", DerivationController.RULE, _annotations_rule2);

		// utility class used to keep track of variables bindings
		// rule: rule2: (_list.getTail())!=null &
		// Contains(_list.getTail(),_element) -> Contains(_list,_element);
		// prereqs: [(_list.getTail())!=null,
		// Contains(_list.getTail(),_element)]
		class _Bindings {
			private test.org.mandarax.compiler.RList _list = list;
			private java.lang.Object _element = element;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite (_list.getTail())!=null

		// case 4
		if (!((_bindings._list.getTail()) != null)) {
			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite Contains(_list.getTail(),_element)

		// case 4

		_tmp = ContainsRelInstances.contains(_derivation.push(), _bindings._list.getTail(), _bindings._element);

		if (!_tmp.hasNext()) {
			_tmp.close();
			return EmptyIterator.DEFAULT;
		}

		// rule head

		return new SingletonIterator(new ContainsRel(_bindings._list, _bindings._element));

	}

	// query: getElements
	// rule: rule1: -> Contains(_list,_list.getHead());
	private static ResourceIterator<ContainsRel> getElements_0(final DerivationController _derivation, final RList list) {

		_derivation.log("test.org.mandarax.compiler.rlist.Contains.rule1", DerivationController.RULE, _annotations_rule1);

		// utility class used to keep track of variables bindings
		// rule: rule1: -> Contains(_list,_list.getHead());
		// prereqs: []
		class _Bindings {
			private test.org.mandarax.compiler.RList _list = list;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// rule head

		return new SingletonIterator(new ContainsRel(_bindings._list, _bindings._list.getHead()));

	}

	// rule: rule2: (_list.getTail())!=null & Contains(_list.getTail(),_element)
	// -> Contains(_list,_element);
	private static ResourceIterator<ContainsRel> getElements_1(final DerivationController _derivation, final RList list) {

		_derivation.log("test.org.mandarax.compiler.rlist.Contains.rule2", DerivationController.RULE, _annotations_rule2);

		// utility class used to keep track of variables bindings
		// rule: rule2: (_list.getTail())!=null &
		// Contains(_list.getTail(),_element) -> Contains(_list,_element);
		// prereqs: [(_list.getTail())!=null,
		// Contains(_list.getTail(),_element)]
		class _Bindings {
			private test.org.mandarax.compiler.RList _list = list;
			private java.lang.Object _element = null;
		}
		final _Bindings _bindings = new _Bindings();
		ResourceIterator<?> _tmp = null;

		// apply prerequisite (_list.getTail())!=null

		// case 4
		if (!((_bindings._list.getTail()) != null)) {
			return EmptyIterator.DEFAULT;
		}

		// apply prerequisite Contains(_list.getTail(),_element)

		// case 1
		final ResourceIterator<ContainsRel> _iterator2 = ContainsRelInstances.getElements(_derivation.push(), _bindings._list.getTail());

		// rule head

		return new NestedIterator<ContainsRel, ContainsRel>(_iterator2) {
			public ResourceIterator<ContainsRel> getNextIterator(ContainsRel _object) {
				// bind parameters from Contains(_list.getTail(),_element)
				_bindings._element = _object.element;

				return new SingletonIterator(new ContainsRel(_bindings._list, _bindings._element));
			}
		};

	}

	// methods representing aggregation functions

}
