abstract class Linked_List<C extends Obj> extends Obj

// The class of linked lists of objects of C extending Obj.

{
	abstract C FindHead();
	
	abstract NonEmptyList<C> insert(C c);

	// Returns the nonempty list obtained by inserting parameter C object as head element of the target list.
	// The type of this function is Linked_List<C> x C --> NonEmptyList<C>.
	
	abstract void traverse(String OutFile);
}