import java.util.Stack;

class ARinsert<C extends Data> extends AR
{
	static BST target; // the target BST object of this call to insert()
	static NonEmptyBST returnVal;
	static RuntimeStack<ARinsert> RuntimeStack = new RuntimeStack<ARinsert>();
	static int count = 0;
	C c;  // parameter

	public String toString()
	{
		return "ARinsert " + "target = " + target + " parameter = " + c.IDcode + " returnVal = " + returnVal;
	}

	void insert()
	{
		count++;
		
		if (target.getClass().getName() == "EmptyBST") {
			target = target.insert(c);
			this.c = c;
			RuntimeStack.push(this);
			RuntimeStack.DisplayInsert();
		}
		
		if (target.getClass().getName() == "NonEmptyBST") {
			//System.out.println("Hello");
		}
	}
}