class ARdelete<C extends Data> extends AR
{
	BST<C> target; // the target BST object of this call to delete()
	String ID;  // parameter
	String rootData;
	BST<C> returnVal;
	NonEmptyBST<C> value;
	static RuntimeStack<ARdelete> Stack = new RuntimeStack<ARdelete>();
	static MyLinkedList List = new MyLinkedList();
	static boolean Reachable;

	void traverse()
	{
		value.traverse(target, Reachable, List);
	}

	void delete()
	{
		ARdelete delete = new ARdelete();
		Stack.push(delete);
		
		int i = ID.compareTo(rootData);
		value = (NonEmptyBST<C>)target;
		
		if ( i < 0 )
		{
			value = (NonEmptyBST<C>)value.left;
		} // go down left subtree
		else if ( i > 0 )
		{
			value = (NonEmptyBST<C>)value.right;
		} // go down right subtree
		else { // i == 0
			if ( value.left instanceof EmptyBST ) {
				
			}
			else if ( value.right instanceof EmptyBST ) {
				
			}
			else // left is nonempty & right is nonempty
			{
				NonEmptyBST<C> t = (NonEmptyBST<C>)value.left;
				if ( t.right instanceof EmptyBST )
				{
					value.data = t.data;
					value.left = t.left;
				}
				else // t.right is nonempty
				{
					while ( !( ((NonEmptyBST<C>)t.right).right instanceof EmptyBST ) )
						t = (NonEmptyBST<C>)t.right;
						value.data = ((NonEmptyBST<C>)t.right).data;
						t.right = ((NonEmptyBST<C>)t.right).left;
				}
			}
		
			target = value;
			Stack.pop();
			
			// as implemented in Project 3
		}
	}
	
}