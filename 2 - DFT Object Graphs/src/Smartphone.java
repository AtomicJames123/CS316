class Smartphone extends PC
{
	
	Smartphone(String ID, MyLinkedList List)
	{
		super(ID);
		//Class = String.valueOf(ClassType.getClass());
		//List.SortedInsertion(Class, objId, ID);
		//objId = count;
		//count++;
		objId = List.Size() + 1;
	}

	@Override
	void traverse(String OutFile) {
		// TODO Auto-generated method stub
		
	}
}
