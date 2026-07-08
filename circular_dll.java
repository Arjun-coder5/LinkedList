public class circular_dll {
   private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
     private Node head = null;
  public static void main(String[] args) {
    circular_dll list = new circular_dll();
     System.out.println("--- Building Circular Doubly Linked List ---");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("\n--- Initial List Traversal ---");
        list.displayForward();
        list.displayBackward();

        System.out.println("\n--- Deleting Mid Element (20) ---");
        list.delete(20);
        list.displayForward();

        System.out.println("\n--- Deleting Head Element (10) ---");
        list.delete(10);
        list.displayForward();
        list.displayBackward();
        
        System.out.println("\n--- Trying to Delete Non-existent Element (99) ---");
        list.delete(99);
  }
  public void insert(int data){
    Node newNode = new Node(data);
     if (head == null) {
            head = newNode;
            head.next = head; // Point to self to maintain circularity
            head.prev = head; // Point to self to maintain circularity
            System.out.println("Inserted " + data + " as the head node.");
            return;
        }
     Node tail = head.prev; 
      tail.next = newNode;   
        newNode.prev = tail;  
        newNode.next = head;  
        head.prev = newNode; 
        System.out.println("Inserted " + data + " at the end.");

  }
  public void delete(int key){
     if (head == null) {
            System.out.println("List is empty. Cannot delete " + key);
            return;
        }

        Node curr = head;
        boolean found = false;

       
        do {
            if (curr.data == key) {
                found = true;
                break;
            }
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Value " + key + " not found in the list.");
            return;
        }

        System.out.println("Deleting value: " + key);

        
        if (curr.next == head && curr.prev == head) {
            head = null;
            return;
        }

       
        if (curr == head) {
            head = head.next; 
        }

       
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
  }
   public void displayForward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Forward Traversal: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head: " + head.data + ")");
    }
     public void displayBackward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Backward Traversal: ");
        Node tail = head.prev; // Start from the last element
        Node temp = tail;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println("(Back to Tail: " + tail.data + ")");
    }

}
