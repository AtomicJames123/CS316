
class GraphNode<C extends Data> extends Obj

// The class of graph nodes containing objects of parameter class C extending Data.

{
	C data; // the C object in this node
	static int NodeID = 0;
	String code;
	boolean visited;
	Linked_List<GraphNode<C>> adjacentNodes = new EmptyList<GraphNode<C>>(); // adjacency list of this node 
	Linked_List<GraphNode<C>> GraphList = new EmptyList<GraphNode<C>>(); // Graph of GraphNodes

	GraphNode(C c, MyLinkedList List)
	{
		this.data = c;
		code = c.IDcode;
		objId = List.Size() + 1;
		NodeID++; // keeps track of the nodes ID
		GraphList.insert(this);
		
	}
	
	public void AddEdge(GraphNode node) {
		adjacentNodes.insert(node);
	}

	public String toString()
	{
		return objId+":"+visited;
	}

	@Override
	void traverse(String OutFile) {
		// TODO Auto-generated method stub
		
	}
}
