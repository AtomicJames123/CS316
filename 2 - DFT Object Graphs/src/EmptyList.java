
class EmptyList<C extends Obj> extends Linked_List<C>

// The class of empty linked lists.

{
	public String toString()
	{
		return objId+":"+visited;
	}
	
	C FindHead() {
		return null;
	}
	

	NonEmptyList<C> insert(C c)

	// Inserts parameter C object into the empty tree, and returns the resulting non-empty tree.
	// The type of this function is EmptyList<C> x C --> NonEmptyList<C>.

	{
		return new NonEmptyList<C>(c, this);
	}

	@Override
	void traverse(String OutFile) {
		// TODO Auto-generated method stub
		
	}


}
