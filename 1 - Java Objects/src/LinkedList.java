import java.io.PrintWriter;

public class LinkedList {
		Node head;
		int count = 0;
		int size = 0;
	
	public LinkedList() {
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
	
	public void SortedInsertion(String ClassType, int id, String code) {
		Node newNode = new Node(ClassType, id, code);
		
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
	
	public void ReverseSortedInsertion(String ClassType, int id, String code) {
		Node newNode = new Node(ClassType, id, code);
		
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
    
    public void CreateOutputList(PrintWriter Output, LinkedList OutputList) {
    	Node CurrentNode = head;
    	String type = CurrentNode.ClassType;
    	Node pointer = null;
    	int CommaCount = 0;
    	
    	String value = new String();
		
		Output.println("Total of " + Size() + " Obj objects have been constructed.");
		Output.println("");
    	
    	while (!IsEmpty()) {
    		count = CountClass(count, type);
    		value = value + "[";
    	
    		while (CurrentNode != null) {
        		
        		if (CurrentNode.ClassType.equals(type) ) {
        			pointer = CurrentNode;
        			CurrentNode = CurrentNode.next;
        			CommaCount++;
        			
        			value = value + pointer.objectid + ":" + pointer.objectCode;
        			
        			if (CommaCount != count) {
        				value = value + ",";
        			}
        			
        			RemoveNode(pointer.objectid);
        			size--;
        		}
        		
        		else {
        			CurrentNode = CurrentNode.next;
        		}
        
    		}
    		
    		value = value + "]";
    		
    		OutputList.ReverseSortedInsertion(type, count, value);
    		
    		
    		if (IsEmpty()) {
    			PrintOutput(Output,OutputList);
    			return;
    		}
    		
    		value = new String();
    		
    		CurrentNode = head;
    		type = CurrentNode.ClassType;
    		CommaCount = 0;
    		count = 0;
    	}
    
    }
     
    public void PrintOutput(PrintWriter Output, LinkedList OutputList) {
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
