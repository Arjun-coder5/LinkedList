class Node {
    int data;
    Node next;

    // Constructor to easily create a new node
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
public class rever_ll {
  public static void main(String[] args) {
     Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head);

        
        head = reverseLinkedList(head);

        System.out.println("\nReversed Linked List:");
        printList(head);
  }
  public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static Node reverseLinkedList(Node head){
       Node prev = null;
       Node current = head;
       Node next = null;
       while(current!=null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
       }
       return prev;
    }
}
