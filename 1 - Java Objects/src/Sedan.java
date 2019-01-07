class Sedan extends Car
{
	
	public Sedan() {
		
	}
	
	public Sedan(int ID, String Code, String Class, LinkedList List) {
		// TODO Auto-generated constructor stub
		objId = ID;
		IDcode = Code;
		List.SortedInsertion(Class, objId, IDcode);
		
	}
}
