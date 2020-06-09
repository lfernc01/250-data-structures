public class Node2 {
	public Node2 next; 
	public Node2 previous;
	public int element;
}

public class CircularDoublyLinkedListWithDummy {
   public Node2 head = new Node2();
   
   public static void main(String[] args) {
 
   }
   
   public CircularDoublyLinkedListWithDummy() {
	   head.next = head;
	   head.previous = head;
   }
   
   public void add(CircularDoublyLinkedListWithDummy list, int element) {
	   Node2 node = new Node2();
	   node.element = element;
	   int index = 0;
	   Node2 current = list.head;
	   while(current.next != null) {
		   index++;
		   current = current.next;
	   }
	   current.next = node;
	   current.previous = current; 
   }
   
}
