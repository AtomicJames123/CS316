class ARinsert<C extends Data> extends AR
{
	BST<C> target; // the target BST object of this call to insert()
	C c;  // parameter
	NonEmptyBST<C> returnVal;
	String value;
	static MyLinkedList List = new MyLinkedList();
	static RuntimeStack<ARinsert> Stack = new RuntimeStack<ARinsert>();
	static boolean Reachable;

	void traverse()
	{
		returnVal.traverse(target, Reachable, List);
	}

	void insert()
	{
		ARinsert insert = new ARinsert();
		Stack.push(insert);
		
		returnVal = new NonEmptyBST<C>(c,target,target);
		List.SortedInsertion(c.getClass().getName(), c.objId, c.IDcode, c.mark);
		
		int i = (c.IDcode).compareTo(returnVal.data.toString());
		
		if ( i < 0 ) {
			returnVal.left = target;
			List.SortedInsertion(returnVal.left.getClass().getName(), returnVal.left.objId, "", returnVal.left.mark);
		}

		else if ( i > 0 ) {
			returnVal.right = target;
			List.SortedInsertion(returnVal.right.getClass().getName(), returnVal.right.objId, "", returnVal.right.mark);
		}
		
		else // i == 0, c.IDcode == data.IDcode
			System.out.println("Data object with the same IDcode "+returnVal.data.IDcode+" already exists in the tree.");
	

		value = returnVal.data.IDcode;
		target = returnVal;	
		
		Stack.pop();
		// as implemented in Project 3
	}
}
