public class LinkedList1 {
 Node head;
 class Node
 {
	 int data;
	 Node next;
	 Node(int d)
	 {
		 data=d;
		 next=null;
	 }
 }
 public void addHeadNode(int new_data)
 {
	 Node new_node=new Node(new_data);
	 new_node.next=head;
	 head=new_node;
 }
 public void insertAfter(Node prev_node,int data)
 {
	 if(prev_node==null)
	 {
		 System.out.println("Prev_Node cannot be null");
	 }
	 Node newNode=new Node(data);
	 newNode.next=prev_node.next;
	 prev_node.next=newNode;
 }
 public void addTailNode(int new_data)
 {
	 Node new_node=new Node(new_data);
	 if(head==null)
	 {
		 head=new Node(new_data);
		return;
	 }
	   new_node.next = null;
	   Node last_node = head;
	   while(last_node.next != null)
	   last_node = last_node.next;
	   last_node.next = new_node;
	   return;
	    }

	    public void displayMyList()
	    {
	   Node temp_node = head;
	   while(temp_node != null)
	   {
	   System.out.print(temp_node.data+" ");
	   temp_node = temp_node.next;
	   }
	    }
	    public static void main(String []args)
	    {
	 
	   LinkedList1 llist = new LinkedList1();
	   llist.addTailNode(7);
	   llist.addTailNode(2);
	   llist.addTailNode(1);
	   llist.addTailNode(8);
	   llist.insertAfter(llist.head.next,3);
	   System.out.println("\nHere is the Linked list : ");
	    }
	 }  
 