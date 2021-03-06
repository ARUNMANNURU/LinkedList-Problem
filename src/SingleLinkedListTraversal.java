/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class SingleLinkedListTraversal{
	
	  // head of list
	 
    /* Linked list Node.  This inner class is made static so that main() can access it */
	
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }
    /*
     * Method to print and traverse through linkedlist
     */
    
	public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
 
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
	
	
    public static void main(String[] args)
    {
        /* Start with the empty list. */
    	SingleLinkedListTraversal llist = new SingleLinkedListTraversal();
 
        llist.head       = new Node(1);
        Node second      = new Node(2);
        Node third       = new Node(3);
 
        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node
 
        llist.printList();
    }

}
