class Desktop extends PC
{
	
	public Desktop() {
		
	}
	
	public Desktop(int ID, String Code, String Class, LinkedList List) {
		// TODO Auto-generated constructor stub
		objId = ID;
		IDcode = Code;
		List.SortedInsertion(Class, objId, IDcode);
		
	}
}

