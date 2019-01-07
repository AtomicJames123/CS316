import java.io.PrintWriter;

class NonEmptyBST<C extends Data> extends BST<C>

// The class of nonempty binary search trees containing C objects.

{
	C data; // the C object at the root
	BST<C> left;  // left subtree
	BST<C> right; // right subtree
	Output Output; // Output File
	int count = 0; // Count of Visited BST objects

	NonEmptyBST(C c, BST<C> l, BST<C> r)
	{
		data = c;
		left = l;
		right = r;
		
	}

	NonEmptyBST(MyLinkedList List) {
		// TODO Auto-generated constructor stub
		objId = List.Size() + 1;
	}

	public String toString()
	{
		return objId+":"+visited;
	}
	
	C FindRoot() {
		//System.out.println(left.FindRoot());
		//System.out.println(right.FindRoot());
		return this.data;
		
	}

	C search(String ID)

	// Returns the C object in the target tree whose IDcode is equal to ID; returns null if no such object found.
	// The type of this function is NonEmptyBST<C> x String--> C.

	{
		int i = ID.compareTo(data.IDcode);
		//System.out.println(i + "i");
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
		//System.out.println(data.IDcode + " This is ROOT DATA");
		//System.out.println(c.toString());
		//if (root == null) {
		//	root = root.insert(c);
			//return this;
		//}
		
		if ( i < 0 ) {
			left = left.insert(c);
			//System.out.println(left.objId + " LEFT");
			//root = left.insert(c);
			//System.out.println(data.IDcode + "LEFT");
		}
		else if ( i > 0 ) {
			right = right.insert(c);
			//System.out.println(data.IDcode + "RIGHT");
			//System.out.println(right.objId + " RIGHT");
		}
		else if (i == 0) { // i == 0, c.IDcode == data.IDcode
			System.out.println("Data object with the same IDcode "+data.IDcode+" already exists in the tree.");
		}
		//System.out.println(c.toString());
		
		return this;
	}

	BST<C> delete(String ID)

	// Returns the tree obtained by deleting from the target tree the C object whose IDcode is equal to ID.
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


	@Override
	void traverse(BST<C> root) {
		// TODO Auto-generated method stub
		Output.displayln("BST traversal has started ...");
		Output.displayln("");
		
		
		NonEmptyBST<C> t = (NonEmptyBST<C>)left; // left subtree
		NonEmptyBST<C> t2 = (NonEmptyBST<C>)right; // right subtree
		
		C value;
		value = root.FindRoot();
		printPreorder(value, root, t); // Prints root node data for BST
		
		root = t.left;
		t.left = root;
		
		printPreorder(t.data, root, t); // traverse left subtree
		
		root = t2.right;
		t2.right = root;
	
		printPreorder(t2.data, root, t2); // traverse right subtree
		
		Output.displayln("");
		Output.displayln("Number of Objects Visited: " + count);
		
	}
	
	void printPreorder(C root, BST<C> T, NonEmptyBST<C> BST)	{
		if (root != null) {
			count++;
			root.visited = true;
	        Output.displayln(root.toString());
	        
	      //printPreorder(root, T, BST); // recursion
		}
	}

	@Override
	void traverse(String OutFile) {
		// TODO Auto-generated method stub
		
	}
	 

}
