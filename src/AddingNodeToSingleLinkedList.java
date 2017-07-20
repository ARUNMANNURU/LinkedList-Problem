

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class AddingNodeToSingleLinkedList {

	/**
	 * @param args
	 */
	
/* Linked list Node.  This inner class is made static so that main() can access it */
	
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }
    
    
    /*
     * Method to print and traverse through linkedlist
     */
    
 
	Node head;
	
    /* method to create a simple linked list with 3 nodes*/
	
	
	/* Three nodes have been allocated  dynamically.
    We have refernces to these three blocks as first,  
    second and third

    llist.head        second              third
       |                |                  |
       |                |                  |
   +----+------+     +----+------+     +----+------+
   | 1  | null |     | 2  | null |     |  3 | null |
   +----+------+     +----+------+     +----+------+ */
	
	
	/*  Now next of first Node refers to second.  So they
    both are linked.

 llist.head        second              third
    |                |                  |
    |                |                  |
+----+------+     +----+------+     +----+------+
| 1  |  o-------->| 2  | null |     |  3 | null |
+----+------+     +----+------+     +----+------+ */
	
	/*  Now next of second Node refers to third.  So all three
    nodes are linked.

 llist.head        second              third
    |                |                  |
    |                |                  |
+----+------+     +----+------+     +----+------+
| 1  |  o-------->| 2  |  o-------->|  3 | null |
+----+------+     +----+------+     +----+------+ */
	
	

    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Start with the empty list. */
		AddingNodeToSingleLinkedList llist = new AddingNodeToSingleLinkedList();
 
        llist.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
 
        llist.push(10);
        llist.insertAfter(third, 5);
        llist.append(0);
        llist.printList();
    	
	}
	
	public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
	
	/* This function is in LinkedList class. Inserts a
	   new Node at front of the list. This method is 
	   defined inside LinkedList class shown above */
	public void push(int new_data)
	{
	    /* 1 & 2: Allocate the Node & Put in the data*/
	    Node new_node = new Node(new_data);
	 
	    /* 3. Make next of new Node as head */
	    new_node.next = head;
	 
	    /* 4. Move the head to point to new Node */
	    head = new_node;
	}
	
	/* This function is in LinkedList class.
	   Inserts a new node after the given prev_node. This method is 
	   defined inside LinkedList class shown above */
	public void insertAfter(Node prev_node, int new_data)
	{
	    /* 1. Check if the given Node is null */
	    if (prev_node == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	 
	    /* 2. Allocate the Node &
	       3. Put in the data*/
	    Node new_node = new Node(new_data);
	 
	    /* 4. Make next of new Node as next of prev_node */
	    new_node.next = prev_node.next;
	 
	    /* 5. make next of prev_node as new_node */
	    prev_node.next = new_node;
	}
	
	/* Appends a new node at the end.  This method is 
	   defined inside LinkedList class shown above */
	public void append(int new_data)
	{
	    /* 1. Allocate the Node &
	       2. Put in the data
	       3. Set next as null */
	    Node new_node = new Node(new_data);
	 
	    /* 4. If the Linked List is empty, then make the
	           new node as head */
	    if (head == null)
	    {
	        head = new Node(new_data);
	        return;
	    }
	 
	    /* 4. This new node is going to be the last node, so
	         make next of it as null */
	    new_node.next = null;
	 
	    /* 5. Else traverse till the last node */
	    Node last = head; 
	    while (last.next != null)
	        last = last.next;
	 
	    /* 6. Change the next of last node */
	    last.next = new_node;
	    return;
	}
	

}
