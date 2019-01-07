class NonEmptyBST<C extends Data> extends BST<C>

// The class of nonempty binary search trees containing C objects.

{
	C data; // the C object at the root
	BST<C> left;  // left subtree
	BST<C> right; // right subtree

	NonEmptyBST(C c, BST<C> l, BST<C> r)
	{
		data = c;
		left = l;
		right = r;
	}

	public String toString()
	{
		return "[" + data + ", " + left + ", " + right + "]";
	}
	
	C search(String ID)

	// Returns the C object in the target tree whose IDcode is equal to ID; returns null if no such object found.
	// The type of this function is NonEmptyBST<C> x String--> C.

	{
		int i = ID.compareTo(data.IDcode);
		if ( i == 0 )
			return data;
		else if ( i < 0 )
			return left.search(ID);
		else // i > 0
			return right.search(ID);
	}

	NonEmptyBST<C> insert(C c)

	// Returns the nonempty tree obtained by inserting parameter C object into the target tree.
	// If the tree already has the object with the same IDcode, issues a message and returns the target tree unchanged.
	// The type of this function is NonEmptyBST<C> x C --> NonEmptyBST<C>.

	{
		int i = (c.IDcode).compareTo(data.IDcode);
		if ( i < 0 )
			left = left.insert(c);
		else if ( i > 0 )
			right = right.insert(c);
		else // i == 0, c.IDcode == data.IDcode
			System.out.println("Data object with the same IDcode "+data.IDcode+" already exists in the tree.");
		return this;
	}
	
	BST<C> delete(String ID)

	// Deletes from the target tree the C object whose IDcode is equal to ID.
	// If the tree has no such object, issues a message and returns the target tree unchanged.
	// The type of this function is NonEmptyBST<C> x String --> BST<C>.

	{
		int i = ID.compareTo(data.IDcode);
		if ( i < 0 )
		{
			left = left.delete(ID);
			return this;
		}
		else if ( i > 0 )
		{
			right = right.delete(ID);
			return this;
		}
		else // i == 0, ID == data.IDcode, the object with ID found at the root
		{
			if ( left instanceof EmptyBST )
				return right;
			else if ( right instanceof EmptyBST )
				return left;
			else // left is nonempty & right is nonempty
			{
				// search for the object whose IDcode is the predecessor of ID, which is the maximum (rightmost) key in the left subtree;
			   	// replace data by that object;
			   	// delete the node containing that object;

				NonEmptyBST<C> t = (NonEmptyBST<C>)left;
				if ( t.right instanceof EmptyBST )
				{
					data = t.data;
					left = t.left;
					return this;
				}
				else // t.right is nonempty
				{
					while ( !( ((NonEmptyBST<C>)t.right).right instanceof EmptyBST ) )
						t = (NonEmptyBST<C>)t.right;
					data = ((NonEmptyBST<C>)t.right).data;
					t.right = ((NonEmptyBST<C>)t.right).left;
					return this;
				}
			}
		}
	}

}
