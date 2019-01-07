
public class Node {
	String ClassType;
	int objectid;
	String objectCode;
	boolean visited;
	Node next;
	
	public Node(String type,int id, String code, boolean v) {
		ClassType = type;
		objectid = id;
		objectCode = code;
		next = null;
		visited = v;
	}

}
