import java.util.Stack;

class ARdelete<C extends Data> extends AR
{
	static BST target; // the target BST object of this call to insert()
	static String ID;  // parameter
	static NonEmptyBST returnVal;
	static RuntimeStack<ARdelete> RuntimeStack = new RuntimeStack<ARdelete>();
	static int count = 0;
	
	void delete()
	{
		count++;
		RuntimeStack.push(this);
		target = target.delete(ID);
		RuntimeStack.DisplayDelete();
	}

	public String toString() {
		return "ARdelete " + "target = " + target + " parameter = " + ID + " returnVal = " + returnVal;
	}
}

