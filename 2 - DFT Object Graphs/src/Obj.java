
abstract class Obj
{
	static int newObjId = 0;
	//int objId = newObjId++;
	int objId;
	//int objId = (int) Math.ceil(newObjId++ / 2); // the unique object identifier
			        // assign newObjId to objId, then increment newObjId
	boolean visited = false; //indicates if this object has been visited by traverse() function
	String objCode;
	String objClass;
	MyLinkedList List = new MyLinkedList(); // For automating adding new objects to data structure within obj class

	Obj()
	{
	// This constructor is automatically invoked by constructors of subclasses.
	// This is the best place to add new Obj object to your data structure.
		//List.SortedInsertion(Class1, objId, code1);
	}

	public abstract String toString();

	abstract void traverse(String OutFile); // the function to perform depth-first traversal of the object graph starting from this object
	

}
