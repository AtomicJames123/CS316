import java.io.PrintWriter;

abstract class GC
{
	static boolean reachable = false;
	static boolean Previousreachable;
	static BST tree;
	static MyLinkedList List;
	static RuntimeStack<AR> Stack = new RuntimeStack<AR>();
	static int ListSize;
	static int Reachable;
	static int Unreachable;
	static ARinsert insert;
	static ARdelete delete;
	static ARsearch search;

	static void mark()
	{
		Previousreachable = reachable;
		reachable = !reachable;
		
		Output.displayln("");
		Output.displayln("Mark phase started.");
		Output.displayln("The value of reachable variable changed to " + reachable + ".");
		Output.displayln("The following reachable objects visited by traversal.");
		Output.displayln("");
		AR ar;

		while (!Stack.isEmpty()) {
			ar = Stack.pop();
			
			if (ar.getClass().getName() == "ARinsert") {
				insert.Reachable = reachable;
				ar.traverse();
			}
			
			if (ar.getClass().getName() == "ARdelete") {
				delete.Reachable = reachable;
				ar.traverse();
			}
			
			if (ar.getClass().getName() == "ARsearch") {
				search.Reachable = reachable;
				ar.traverse();
			}
			
			//ar.traverse();
			
		}
		
		// implement mark phase
	}

	static void sweep()
	{
		Output.displayln("");
		Reachable = 0;
		Unreachable = 0;
		Output.displayln("Sweep phase started.");
		Output.displayln("");
		// implement sweep phase by scanning your data structure maintaining allocated Obj objects
		Node CurrentNode = List.head;
		
		while (CurrentNode != null) {
			
			if (CurrentNode.mark == reachable) {
				Reachable++;
				Output.display("+");
			}
			
			else {
				Unreachable++;
				Output.display("-");
			}
			
			Output.displayln(CurrentNode.toString());

			CurrentNode = CurrentNode.next;
			
		}
		
		Output.displayln("");
		Output.displayln("# of reachable objects = " + Reachable);
		Output.displayln("# of unreachable objects = " + Unreachable);
		Output.displayln("");
		
		if (Unreachable > 0) {
			List.Sweep(Previousreachable, List);
		}
	
	}

	static void gc() // invoke GC emulation
	{
		Output.displayln("-------------------------------------------------\n");
		Output.displayln("");
		Output.displayln("Mark-and-sweep GC emulation started.\n");
		mark();
		sweep();	
	}
	
	
	static void setTree(BST Tree) {
		tree = Tree;
	}
	
	static void setStack(RuntimeStack<AR> MyStack) {
		Stack = MyStack;
	}
}