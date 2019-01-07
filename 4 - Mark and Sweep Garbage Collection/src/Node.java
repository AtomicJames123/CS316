
public class Node {
	String ClassType;
	int objectid;
	String objectCode;
	static boolean mark;
	Node next;
	
	public Node(String type,int id, String code, boolean m) {
		ClassType = type;
		objectid = id;
		objectCode = code;
		next = null;
		mark = m;
	}
	
	public String toString()
	{
		return mark + ":" + objectid + ":" + ClassType;
	}

}