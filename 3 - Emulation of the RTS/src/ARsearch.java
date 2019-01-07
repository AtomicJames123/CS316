import java.util.Stack;

class ARsearch<C extends Data> extends AR
{
	static BST target; // the target BST object of this call to search()
	static String ID;  // parameter
	C returnVal;
	static RuntimeStack<ARsearch> RuntimeStack = new RuntimeStack<ARsearch>();
	static int count = 0;

	public String toString()
	{
		return "ARsearch " + "target = " + target + " parameter = " + ID + " returnVal = " + returnVal;
	}

	void search()
	{
		count++;
		RuntimeStack.push(this);
		returnVal = (C) target.search(ID);
		RuntimeStack.DisplaySearch();
	}
}
