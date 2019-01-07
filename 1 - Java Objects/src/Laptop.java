class Laptop extends PC
{
	
	public Laptop() {
		
	}
	
	public Laptop(int ID, String Code, String Class, LinkedList List) {
		// TODO Auto-generated constructor stub
		objId = ID;
		IDcode = Code;
		List.SortedInsertion(Class, objId, IDcode);
		
	}
}
