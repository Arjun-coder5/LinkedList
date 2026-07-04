public class circular_ll_traversal{
   private Node head;

    // Node class structure
    public static class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }
  public static void main(String[] args) {
        Node head = new Node(10); 
        Node temp1 = new Node(20); 
        Node temp2 = new Node(30); 
        head.next = temp1; 
        temp1.prev = head; 
        temp1.next = temp2; 
        temp2.prev = temp1; 
        temp2.next = head; 
        head.prev = temp2; 

        printList(head); 
  }
      static void printList(Node head) { 
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head; 
        do { 
            System.out.print(temp.data + " <-> "); 
            temp = temp.next; 
        } while (temp != head); 
        System.out.println("(Head)");
    }
}