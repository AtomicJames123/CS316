class NonEmptyBST<C extends Data> extends BST<C>

// The class of nonempty binary search trees containing C objects.

{
	C data; // the C object at the root
	BST<C> left;  // left subtree
	BST<C> right; // right subtree
	static boolean mark;
	static int DataID;
	static int LeftID;
	static int RightID;
	static MyLinkedList tempList;

	NonEmptyBST(C c, BST<C> l, BST<C> r)
	{
		data = c;
		left = l;
		right = r;
	}

	void traverse(BST<C> bst, boolean value, MyLinkedList List)
	{
		mark = value;
		tempList = List;
		Node CurrentNode;
		CurrentNode = tempList.head;
		if (bst != null) {
			traverse();
		}
		
		else {
			
		}
		
		while (CurrentNode != null) {
			
			if (CurrentNode.objectid == DataID) {
				CurrentNode.mark = data.mark;	
			}
			if (CurrentNode.objectid == LeftID) {
				CurrentNode.mark = left.mark;
			}
			if (CurrentNode.objectid == RightID) {
				CurrentNode.mark = right.mark;
			}
			
			CurrentNode = CurrentNode.next;
		}
		
		List = tempList;
		
	}

	void traverse() {	
		data.mark = mark;
		Output.displayln(data.toString());
		DataID = data.objId;
		
		left.mark = mark;
		Output.displayln(left.toString());
		LeftID = left.objId;
		//left.traverse();
		
		right.mark = mark;
		Output.displayln(right.toString());
		RightID = right.objId;
		//right.traverse();

	} 
}
