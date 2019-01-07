
import java.io.PrintWriter;

public class MyLinkedList {
	Node head;
	int count = 0;
	int size = 0;
	int visitedcount = 0;
	int unvisitedcount = 0;

public MyLinkedList() {
	head = null;
}

public boolean IsEmpty() {
	if (head == null) {
		return true;
}
	
	return false;
}

public int Size() {
	return size;
}

public void Sweep(boolean value, MyLinkedList List) {
	Node CurrentNode = List.head;
	int Code = CurrentNode.objectid;
	while (CurrentNode != null) {
		
		if (CurrentNode.mark == value) {
			Code = CurrentNode.objectid;
			//List.RemoveNode(Code);
		}
		
		CurrentNode = CurrentNode.next;
	}
	
	Output.displayln("The unreachable objects have been deleted from the data structure maintaining Obj objects.");
}

public void SortedInsertion(String ClassType, int id, String code, boolean v) {
	Node newNode = new Node(ClassType, id, code, v);
	
    if (head == null || head.objectid >= newNode.objectid) {
    	newNode.next = head;
        head = newNode;
        size++;
        return;
    }
    
    Node CurrentNode = head;
    
    while (CurrentNode.next != null && CurrentNode.next.objectid < newNode.objectid) {
    	CurrentNode = CurrentNode.next;
    }
              
    newNode.next = CurrentNode.next;
    CurrentNode.next = newNode;
    size++;
	
}

public void ReverseSortedInsertion(String ClassType, int id, String code, boolean v) {
	Node newNode = new Node(ClassType, id, code, v);
	
    if (head == null || head.objectid <= newNode.objectid) {
    	newNode.next = head;
        head = newNode;
        size++;
        return;
    }
    
    Node CurrentNode = head;
    
    while (CurrentNode.next != null && CurrentNode.next.objectid > newNode.objectid) {
    	CurrentNode = CurrentNode.next;
    }
                
    newNode.next = CurrentNode.next;
    CurrentNode.next = newNode;
    size++;
	
}

public void RemoveNode(int ID) {
	Node CurrentNode = head;
    Node CurrentNodePrevious = null;
        
    if (IsEmpty()) {
        return;
    }
 
    if (CurrentNode != null && CurrentNode.objectid == ID)	{
    	head = CurrentNode.next;
        return;
    } // If head is ID then change head to next node

    while (CurrentNode != null && CurrentNode.objectid != ID)	{
    	CurrentNodePrevious = CurrentNode;
        CurrentNode = CurrentNode.next;
    }    

    CurrentNodePrevious.next = CurrentNode.next;
    
}

public void CreateOutputList(PrintWriter Output, MyLinkedList OutputList) {
	Node CurrentNode = head;
	String type = CurrentNode.ClassType;
	String type2 = "NonEmptyBST";
	String type3 = "EmptyBST";
	boolean TF = false;
	Node pointer = null;
	int CommaCount = 0;
	int CommaCountVisited = 0;
	int CommaCountunVisited = 0;
	
	String value = new String();
	String visited = new String();
	String unvisited = new String();
	
	Output.println("Total of " + Size() + " Obj objects have been constructed.");
	Output.println("");
	
	while (!IsEmpty()) {
		count = CountClass(count, type);
		value = value + "[";
		visited = visited + "[";
		unvisited = unvisited + "[";
	
		while (CurrentNode != null) {
			
    		
    		if (CurrentNode.ClassType.equals(type) ) {
    			pointer = CurrentNode;
    			CurrentNode = CurrentNode.next;
    			CommaCount++;
    			CommaCountVisited++;
    			CommaCountunVisited++;
    			
    			TF = pointer.mark;
    			
    			//if (!(CurrentNode.ClassType.equals("NonEmptyBST") || CurrentNode.ClassType.equals("EmptyBST"))) {
    			
    			value = value + pointer.objectid + ":" + pointer.mark;
    			
    			if (pointer.objectCode != "") {
    				value = value + ":" + pointer.objectCode;
    			}
    			//}
    			
    			if (CommaCount != count) {
    				value = value + ",";
    			}
    			
    			if (pointer.mark) {
    				visited = visited + pointer.objectid + ":" + pointer.mark;
    				
    				if (pointer.objectCode != "") {
        				visited = visited + ":" + pointer.objectCode;
        			}
    				
    				visitedcount++;
    				
    				if (CommaCountVisited != count) {
        				visited = visited + ",";
        			}
    				
    			}
    			
    			if (!pointer.mark) {
    				unvisited = unvisited + pointer.objectid + ":" + pointer.mark;
    				
    				if (pointer.objectCode != "") {
        				unvisited = unvisited + ":" + pointer.objectCode;
        			}
    				
    				unvisitedcount++;
    				
    				if (CommaCountunVisited != count) {
        				unvisited = unvisited + ",";
        			}
    			}
    			
    			RemoveNode(pointer.objectid);
    			size--;
    		}
    		
    		else {
    			CurrentNode = CurrentNode.next;
    		}
    
		}
		
		value = value + "]";
		visited = visited + "]";
		unvisited = unvisited + "]";
		
		value = value + "\r\n" + "list of visited objects:" + "\r\n" + visited + "\r\n" + visitedcount + " objects visited" +
				"\r\n" + "list of unvisited objects:" + "\r\n" + unvisited + "\r\n" + unvisitedcount + " objects unvisited" 
				+ "\r\n" + "---------------------------------------------------------";
		
		
		OutputList.ReverseSortedInsertion(type, count, value, TF );
		
		
		if (IsEmpty()) {
			PrintOutput(Output,OutputList);
			return;
		}
		
		value = new String();
		visited = new String();
		unvisited = new String();
		
		CurrentNode = head;
		type = CurrentNode.ClassType;
		CommaCount = 0;
		CommaCountVisited = 0;
		CommaCountunVisited = 0;
		count = 0;
		visitedcount = 0;
		unvisitedcount = 0;
	}

}

public void ResetList(MyLinkedList List) {
	List = new MyLinkedList();
}
 
public void PrintOutput(PrintWriter Output, MyLinkedList OutputList) {
	Node CurrentNode = OutputList.head;
	
	while (CurrentNode != null ) {
		Output.println(CurrentNode.objectid + " objects of " + CurrentNode.ClassType);
		Output.println(CurrentNode.objectCode);
		Output.println();
		
		CurrentNode = CurrentNode.next;
	}
	
}

public int CountClass(int value, String type) {
	Node CurrentNode = head;
	
	while (CurrentNode != null) {
		
		if (CurrentNode.ClassType.equals(type) ) {
			value++;
		}
			
		CurrentNode = CurrentNode.next;
	
	}
	
	return value;
}
	
}