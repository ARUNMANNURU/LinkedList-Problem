/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class GetNthNodeFromEnd {

	/**
	 * @param args
	 */
	
	Node head; // head of the list
	 
    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	
    /* Function to get the nth node from the last of a
    linked list */
 void printNthFromLast(int n)
 {
     int len = 0;
     Node temp = head;

     // 1) count the number of nodes in Linked List
     while (temp != null)
     {
         temp = temp.next;
         len++;
     }

     // check if value of n is not more than length of
     // the linked list
     if (len < n)
         return;

     temp = head;

     // 2) get the (n-len+1)th node from the begining
     for (int i = 1; i < len-n+1; i++)
         temp = temp.next;

     System.out.println(temp.data);
 }
 
 /* Inserts a new Node at front of the list. */
 public void push(int new_data)
 {
     /* 1 & 2: Allocate the Node &
               Put in the data*/
     Node new_node = new Node(new_data);

     /* 3. Make next of new Node as head */
     new_node.next = head;

     /* 4. Move the head to point to new Node */
     head = new_node;
 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		GetNthNodeFromEnd llist = new GetNthNodeFromEnd();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
 
        llist.printNthFromLast(1);
		
		
	}

}
