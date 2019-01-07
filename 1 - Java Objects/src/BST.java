abstract class BST<C extends Data> extends Obj

// The class of binary search trees containing objects of parameter class C extending Data.
// The ordering is determined by C.IDcode.

{
	abstract C search(String ID);

	// Returns the C object in the target tree whose IDcode is equal to ID; returns null if no such object found.
	// The type of this function is BST<C> x String --> C.

	abstract NonEmptyBST<C> insert(C c);

	// Returns the nonempty tree obtained by inserting parameter C object into the target tree.
	// If the tree already has the object with the same IDcode, issues a message and returns the target tree unchanged.
	// The type of this function is BST<C> x C --> NonEmptyBST<C>.

	abstract BST<C> delete(String ID);

	// Deletes from the target tree the C object whose IDcode is equal to ID.
	// If the tree has no such object, issues a message and returns the target tree unchanged.
	// The type of this function is BST<C> x String --> BST<C>.
}
