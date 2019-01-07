abstract class Data extends Obj
{
	String IDcode; // the ID code of Data objects
	String Class;

	Data(String ID)
	{
		IDcode = ID;
		Class = getClass().getName();
		objClass = Class;
		objCode = IDcode;
	}

	public String toString()
	{
		return Class+":"+objId+":"+visited+":"+IDcode;
	}
}
