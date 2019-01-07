class EmptyBST<C extends Data> extends BST<C>

// The class of empty binary search trees.

{
	public String toString()
	{
		return objId+"";
	}

	C search(String ID)

	// The type of this function is EmptyBST<C> x String --> C.

	{
		return null;
	}

	NonEmptyBST<C> insert(C c)

	// Inserts parameter C object into the empty tree, and returns the resulting non-empty tree.
	// The type of this function is EmptyBST<C> x C --> NonEmptyBST<C>.

	{
		return new NonEmptyBST<C>(c, this, this);
	}

	EmptyBST<C> delete(String ID)

	// Issues a message and returns the empty tree.
	// The type of this function is EmptyBST<C> x String --> EmptyBST<C>.

	{
		System.out.println("Data object with the given IDcode "+ID+" does not exist in the tree.");
		return this;
	}
}