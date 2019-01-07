class Smartphone extends PC
{
	
	public Smartphone() {
		
	}
	
	public Smartphone(int ID, String Code, String Class, LinkedList List) {
		// TODO Auto-generated constructor stub
		objId = ID;
		IDcode = Code;
		List.SortedInsertion(Class, objId, IDcode);
		
	}
	

}
