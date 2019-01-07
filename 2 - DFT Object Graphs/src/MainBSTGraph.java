public abstract class MainBSTGraph
{
	public static void main(String argv[]) {
	// argv[0]: output file

	Output.setOutput( argv[0] ); // set output to testOutput.txt
	
	MyLinkedList List = new MyLinkedList();
	MyLinkedList List2 = new MyLinkedList();
		
	BST<PC> PC = new EmptyBST<PC>();
	
	Smartphone IDcode1 = new Smartphone("s001", List);
	PC = PC.insert(IDcode1);
	String class1 = String.valueOf(IDcode1.getClass());
	List.SortedInsertion(class1, IDcode1.objId, IDcode1.IDcode, IDcode1.visited);
	//List2.SortedInsertion(class1, IDcode1.objId, IDcode1.IDcode, IDcode1.visited);
	
	Laptop IDcode2 = new Laptop("l001", List);
	PC = PC.insert(IDcode2);
	String class2 = String.valueOf(IDcode2.getClass());
	List.SortedInsertion(class2, IDcode2.objId, IDcode2.IDcode, IDcode2.visited );
	//List2.SortedInsertion(class2, IDcode2.objId, IDcode2.IDcode, IDcode2.visited );
	
	Desktop	IDcode3 = new Desktop("d001", List);
	PC = PC.insert(IDcode3);
	String class3 = String.valueOf(IDcode3.getClass());
	List.SortedInsertion(class3, IDcode3.objId, IDcode3.IDcode, IDcode3.visited);
	//List2.SortedInsertion(class3, IDcode3.objId, IDcode3.IDcode, IDcode3.visited);
	
	Smartphone IDcode4 = new Smartphone("s002", List);
	PC = PC.insert(IDcode4);
	String class4 = String.valueOf(IDcode4.getClass());
	List.SortedInsertion(class4, IDcode4.objId, IDcode4.IDcode, IDcode4.visited);
	//List2.SortedInsertion(class4, IDcode4.objId, IDcode4.IDcode, IDcode4.visited);
	
	Laptop	IDcode5 = new Laptop("1002", List);
	PC = PC.insert(IDcode5);
	String class5 = String.valueOf(IDcode5.getClass());
	List.SortedInsertion(class5, IDcode5.objId, IDcode5.IDcode, IDcode5.visited);
	//List2.SortedInsertion(class5, IDcode5.objId, IDcode5.IDcode, IDcode5.visited);
	
	Desktop	IDcode6 = new Desktop("d002", List);
	PC = PC.insert(IDcode6);
	String class6 = String.valueOf(IDcode5.getClass());
	List.SortedInsertion(class6, IDcode6.objId, IDcode6.IDcode, IDcode6.visited);
	//List2.SortedInsertion(class6, IDcode6.objId, IDcode6.IDcode, IDcode6.visited);
	
	Smartphone IDcode7 = new Smartphone("s003", List);
	PC = PC.insert(IDcode7);
	String class7 = String.valueOf(IDcode7.getClass());
	List.SortedInsertion(class7, IDcode7.objId, IDcode7.IDcode, IDcode7.visited);
	//List2.SortedInsertion(class7, IDcode7.objId, IDcode7.IDcode, IDcode7.visited);
	
	Laptop	IDcode8 = new Laptop("1003", List);
	PC = PC.insert(IDcode8);
	String class8 = String.valueOf(IDcode8.getClass());
	List.SortedInsertion(class8, IDcode8.objId, IDcode8.IDcode, IDcode8.visited);
	//List2.SortedInsertion(class8, IDcode8.objId, IDcode8.IDcode, IDcode8.visited);
	
	NonEmptyBST IDcode24 = new NonEmptyBST(List);
	String class24 = String.valueOf(IDcode24.getClass());
	List.SortedInsertion(class24, IDcode24.objId, "", IDcode24.visited);
	//List2.SortedInsertion(class24, IDcode24.objId, "",IDcode24.visited);
	
	Desktop	IDcode9 = new Desktop("d003", List);
	PC = PC.insert(IDcode9);
	String class9 = String.valueOf(IDcode9.getClass());
	List.SortedInsertion(class9, IDcode9.objId, IDcode9.IDcode, IDcode9.visited);
	//List2.SortedInsertion(class9, IDcode9.objId, IDcode9.IDcode, IDcode9.visited);
	
	Smartphone IDcode10 = new Smartphone("s004", List);
	PC = PC.insert(IDcode10);	
	String class10 = String.valueOf(IDcode7.getClass());
	List.SortedInsertion(class10, IDcode10.objId, IDcode10.IDcode, IDcode10.visited);
	//List2.SortedInsertion(class10, IDcode10.objId, IDcode10.IDcode, IDcode10.visited);
	
	Laptop	IDcode11 = new Laptop("1004", List);
	PC = PC.insert(IDcode11);
	String class11 = String.valueOf(IDcode11.getClass());
	List.SortedInsertion(class11, IDcode11.objId, IDcode11.IDcode, IDcode11.visited);
	//List2.SortedInsertion(class11, IDcode11.objId, IDcode11.IDcode, IDcode11.visited);
	
	Desktop	IDcode12 = new Desktop("d004", List);
	PC = PC.insert(IDcode12);
	String class12 = String.valueOf(IDcode12.getClass());
	List.SortedInsertion(class12, IDcode12.objId, IDcode12.IDcode, IDcode12.visited);
	//List2.SortedInsertion(class12, IDcode12.objId, IDcode12.IDcode, IDcode12.visited);
		
	BST<Car> Car = new EmptyBST<Car>();
	
	Sedan IDcode13 = new Sedan("se001", List);
	Car = Car.insert(IDcode13);
	String class13 = String.valueOf(IDcode13.getClass());
	List.SortedInsertion(class13, IDcode13.objId, IDcode13.IDcode, IDcode13.visited);
	//List2.SortedInsertion(class13, IDcode13.objId, IDcode13.IDcode, IDcode13.visited);
	
	Coupe IDcode14 = new Coupe("co001", List);
	Car = Car.insert(IDcode14);
	String class14 = String.valueOf(IDcode14.getClass());
	List.SortedInsertion(class14, IDcode14.objId, IDcode14.IDcode, IDcode14.visited);
	//List2.SortedInsertion(class14, IDcode14.objId, IDcode14.IDcode, IDcode14.visited);
	
	NonEmptyBST IDcode27 = new NonEmptyBST(List);
	String class27 = String.valueOf(IDcode27.getClass());
	List.SortedInsertion(class27, IDcode27.objId, "", IDcode27.visited);
	//List2.SortedInsertion(class27, IDcode27.objId, "", IDcode27.visited);
	
	Van	IDcode15 = new Van("va001", List);
	Car = Car.insert(IDcode15);
	String class15 = String.valueOf(IDcode15.getClass());
	List.SortedInsertion(class15, IDcode15.objId, IDcode15.IDcode, IDcode15.visited);
	//List2.SortedInsertion(class15, IDcode15.objId, IDcode15.IDcode, IDcode15.visited);
	
	NonEmptyBST IDcode28 = new NonEmptyBST(List);
	String class28 = String.valueOf(IDcode28.getClass());
	List.SortedInsertion(class28, IDcode28.objId, "",IDcode28.visited);
	//List2.SortedInsertion(class28, IDcode28.objId, "",IDcode28.visited);
	
	Sedan IDcode16 = new Sedan("se002", List);
	Car = Car.insert(IDcode16);
	String class16 = String.valueOf(IDcode16.getClass());
	List.SortedInsertion(class16, IDcode16.objId, IDcode16.IDcode, IDcode16.visited);
	//List2.SortedInsertion(class16, IDcode16.objId, IDcode16.IDcode, IDcode16.visited);
	
	Coupe IDcode17 = new Coupe("co002", List);
	Car = Car.insert(IDcode17);
	String class17 = String.valueOf(IDcode17.getClass());
	List.SortedInsertion(class17, IDcode17.objId, IDcode17.IDcode, IDcode17.visited);
	//List2.SortedInsertion(class17, IDcode17.objId, IDcode17.IDcode, IDcode17.visited);
	
	Van	IDcode18 = new Van("va002", List);
	Car = Car.insert(IDcode17);
	String class18 = String.valueOf(IDcode18.getClass());
	List.SortedInsertion(class18, IDcode18.objId, IDcode18.IDcode, IDcode18.visited);
	//List2.SortedInsertion(class18, IDcode18.objId, IDcode18.IDcode, IDcode18.visited);
	
	Sedan IDcode19 = new Sedan("se003", List);
	Car = Car.insert(IDcode19);
	String class19 = String.valueOf(IDcode19.getClass());
	List.SortedInsertion(class19, IDcode19.objId, IDcode19.IDcode, IDcode19.visited);
	//List2.SortedInsertion(class19, IDcode19.objId, IDcode19.IDcode, IDcode19.visited);
	
	Coupe IDcode20 = new Coupe("co003", List);
	Car = Car.insert(IDcode20);
	String class20 = String.valueOf(IDcode20.getClass());
	List.SortedInsertion(class20, IDcode20.objId, IDcode20.IDcode, IDcode20.visited);
	//List2.SortedInsertion(class20, IDcode20.objId, IDcode20.IDcode, IDcode20.visited);
	
	EmptyBST IDcode23 = new EmptyBST(List);
	String class23 = String.valueOf(IDcode23.getClass());
	List.SortedInsertion(class23, IDcode23.objId, "", IDcode23.visited);
	//List2.SortedInsertion(class23, IDcode23.objId, "", IDcode23.visited);
	
	Van	IDcode21  = new Van("va003", List);
	Car = Car.insert(IDcode21);
	String class21 = String.valueOf(IDcode21.getClass());
	List.SortedInsertion(class21, IDcode21.objId, IDcode21.IDcode, IDcode21.visited);
	//List2.SortedInsertion(class21, IDcode21.objId, IDcode21.IDcode, IDcode21.visited);
	
	EmptyBST IDcode25 = new EmptyBST(List);
	String class25 = String.valueOf(IDcode25.getClass());
	List.SortedInsertion(class25, IDcode25.objId, "", IDcode25.visited);
	//List2.SortedInsertion(class25, IDcode25.objId, "", IDcode25.visited);
	
	EmptyBST IDcode26 = new EmptyBST(List);
	String class26 = String.valueOf(IDcode26.getClass());
	List.SortedInsertion(class26, IDcode26.objId, "", IDcode26.visited);
	
	MyLinkedList OutputList = new MyLinkedList();
	MyLinkedList OutputList2 = new MyLinkedList();
	
	Output.DisplayList(List, OutputList , argv[0]);
	
	PC = PC.delete("s001");
	PC = PC.delete("l001");
	PC = PC.delete("d001");
	
	Car = Car.delete("se001");
	Car = Car.delete("co001");
	Car = Car.delete("va001");
	
	GraphNode node13 = new GraphNode(IDcode13, List2);

	GraphNode node14 = new GraphNode(IDcode14, List2);

	GraphNode node15 = new GraphNode(IDcode15, List2);

	GraphNode node16 = new GraphNode(IDcode16, List2);
	
	GraphNode node17 = new GraphNode(IDcode17, List2);
	
	GraphNode node18 = new GraphNode(IDcode18, List2);
	
	GraphNode node19 = new GraphNode(IDcode19, List2);
	
	GraphNode node20 = new GraphNode(IDcode20, List2);
	
	GraphNode node21 = new GraphNode(IDcode21, List2);

	node13.AddEdge(node14);
	node13.AddEdge(node17);
	
	node14.AddEdge(node13);
	node14.AddEdge(node15);
	node14.AddEdge(node17);
	node14.AddEdge(node18);
	
	node15.AddEdge(node14);
	node15.AddEdge(node16);
	node15.AddEdge(node18);
	
	node16.AddEdge(node15);
	node16.AddEdge(node19);
	
	node17.AddEdge(node13);
	node17.AddEdge(node14);
	node17.AddEdge(node18);
	node17.AddEdge(node20);
	
	node18.AddEdge(node14);
	node18.AddEdge(node15);
	node18.AddEdge(node17);
	node18.AddEdge(node19);
	
	node19.AddEdge(node16);
	node19.AddEdge(node18);
	node19.AddEdge(node21);
	
	node20.AddEdge(node17);
	node20.AddEdge(node21);
	
	node21.AddEdge(node18);
	node21.AddEdge(node19);
	node21.AddEdge(node20); // Creation of adjacency matrix for each GraphNode
	
	Output.displayln("Traversing the PC BST");
	
	Output.displayln("---------------------------------------------------------");
	
	PC.traverse(PC);
	
	Output.displayln("---------------------------------------------------------");
	
	//PC BST Traversal
	
	Output.displayln("");
	
	Output.displayln("Traversing the Car BST");
	
	Output.displayln("---------------------------------------------------------");
	
	Car.traverse(Car);
	
	Output.displayln("---------------------------------------------------------");
	
	//Car BST Traversal
	
	Output.displayln("");
	
	Output.displayln("Traversing the Car Graph");
	
	Output.displayln("---------------------------------------------------------");
	
	
	
	Output.displayln("---------------------------------------------------------");
	
	//Car Graph Traversal
	
	List2.SortedInsertion(class1, IDcode1.objId, IDcode1.IDcode, IDcode1.visited);
	List2.SortedInsertion(class2, IDcode2.objId, IDcode2.IDcode, IDcode2.visited);
	List2.SortedInsertion(class3, IDcode3.objId, IDcode3.IDcode, IDcode3.visited);
	List2.SortedInsertion(class4, IDcode4.objId, IDcode4.IDcode, IDcode4.visited);
	List2.SortedInsertion(class5, IDcode5.objId, IDcode5.IDcode, IDcode5.visited);
	List2.SortedInsertion(class6, IDcode6.objId, IDcode6.IDcode, IDcode6.visited);
	List2.SortedInsertion(class7, IDcode7.objId, IDcode7.IDcode, IDcode7.visited);
	List2.SortedInsertion(class8, IDcode8.objId, IDcode8.IDcode, IDcode8.visited);
	List2.SortedInsertion(class24, IDcode24.objId, "",IDcode24.visited);
	List2.SortedInsertion(class9, IDcode9.objId, IDcode9.IDcode, IDcode9.visited);
	List2.SortedInsertion(class10, IDcode10.objId, IDcode10.IDcode, IDcode10.visited);
	List2.SortedInsertion(class11, IDcode11.objId, IDcode11.IDcode, IDcode11.visited);
	List2.SortedInsertion(class12, IDcode12.objId, IDcode12.IDcode, IDcode12.visited);
	List2.SortedInsertion(class13, IDcode13.objId, IDcode13.IDcode, IDcode13.visited);
	List2.SortedInsertion(class14, IDcode14.objId, IDcode14.IDcode, IDcode14.visited);
	List2.SortedInsertion(class27, IDcode27.objId, "", IDcode27.visited);
	List2.SortedInsertion(class15, IDcode15.objId, IDcode15.IDcode, IDcode15.visited);
	List2.SortedInsertion(class28, IDcode28.objId, "",IDcode28.visited);
	List2.SortedInsertion(class16, IDcode16.objId, IDcode16.IDcode, IDcode16.visited);
	List2.SortedInsertion(class17, IDcode17.objId, IDcode17.IDcode, IDcode17.visited);
	List2.SortedInsertion(class18, IDcode18.objId, IDcode18.IDcode, IDcode18.visited);
	List2.SortedInsertion(class19, IDcode19.objId, IDcode19.IDcode, IDcode19.visited);
	List2.SortedInsertion(class20, IDcode20.objId, IDcode20.IDcode, IDcode20.visited);
	List2.SortedInsertion(class23, IDcode23.objId, "", IDcode23.visited);
	List2.SortedInsertion(class21, IDcode21.objId, IDcode21.IDcode, IDcode21.visited);
	List2.SortedInsertion(class25, IDcode25.objId, "", IDcode25.visited);
	List2.SortedInsertion(class26, IDcode26.objId, "", IDcode26.visited);
	//Updated Objects added to an updated List for some visited values have gone from false to true
	
	Output.DisplayList(List2, OutputList2 , argv[0]);
	
	Output.closeOutput();
	
	}
}
