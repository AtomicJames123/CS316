
class NonEmptyList<C extends Obj> extends Linked_List<C>

// The class of nonempty lists containing C objects.

{
	C obj; // the C object at the head
	Linked_List<C> tail; // tail list
	Output output;

	NonEmptyList(C c, Linked_List<C> tl)
	{
		obj = c;
		tail = tl;
	}
	
	C FindHead() {
		return obj;
	}

	public String toString()
	{
		return objId+":"+visited;
	}

	NonEmptyList<C> insert(C c)

	// Returns the nonempty list obtained by inserting parameter C object as head element of the target list.
	// The type of this function is NonEmptyList<C> x C --> NonEmptyList<C>.

	{
		return new NonEmptyList<C>(c, this);
	}

	@Override
	void traverse(String OutFile) {
		// TODO Auto-generated method stub
		
	}


}
