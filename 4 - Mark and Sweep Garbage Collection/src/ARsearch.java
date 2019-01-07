class ARsearch<C extends Data> extends AR
{
	BST<C> target; // the target BST object of this call to search()
	String ID;  // parameter
	C returnVal;
	NonEmptyBST<C> value;
	static RuntimeStack<ARsearch> Stack = new RuntimeStack<ARsearch>();
	static MyLinkedList List = new MyLinkedList();
	static boolean Reachable;

	void traverse()
	{
		value.traverse(target,Reachable,List);
	}

	void search()
	{
		ARsearch search = new ARsearch();
		Stack.push(search);
		value = (NonEmptyBST<C>) target;
		int i = ID.compareTo(returnVal.IDcode);
		if (i == 0) {
			
		}
		
		else if (i < 0) {
			target = value.left;
		}
		
		else {
			target = value.right;
		}
		
		Stack.pop();
		// as implemented in Project 3
	}
}
