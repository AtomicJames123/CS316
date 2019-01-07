
public class Node {
	String ClassType;
	int objectid;
	String objectCode;
	Node next;
	
	public Node(String type,int id, String code) {
		ClassType = type;
		objectid = id;
		objectCode = code;
		next = null;
	}

}
