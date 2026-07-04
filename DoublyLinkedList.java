public class DoublyLinkedList {
   
    private Node head;

    // Node class structure
    public class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    // 1. Add a node at the front (GeeksforGeeks: push)
    public void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // 2. Add a node after a given node (GeeksforGeeks: InsertAfter)
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // 3. Add a node before a given node (GeeksforGeeks: InsertBefore)
    public void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("The given next node cannot be NULL");
            return;
        }

        Node newNode = new Node(data);
        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;
        newNode.next = nextNode;

        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        } else {
            head = newNode; // If inserting before the original head
        }
    }

    // 4. Add a node at the end (GeeksforGeeks: append)
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    // Print the list from head to end
    public void printForward() {
        System.out.print("Forward:  ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Print the list from end to head using .prev
    public void printBackward() {
        System.out.print("Backward: ");
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        while (last != null) {
            System.out.print(last.data + " <-> ");
            last = last.prev;
        }
        System.out.println("NULL");
    }

    // Complete main method testing all 4 operations
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("--- Building the Doubly Linked List ---");
        
        // Test 1 & 4: Front and End insertions
        dll.insertEnd(10);
        dll.insertEnd(30);
        dll.insertFront(5); 
        // Current sequence: 5 <-> 10 <-> 30

        // Test 2: Insert After a specific node (Insert 20 after 10)
        // dll.head.next targets node 10
        dll.insertAfter(dll.head.next, 20); 
        // Current sequence: 5 <-> 10 <-> 20 <-> 30

        // Test 3: Insert Before a specific node (Insert 25 before 30)
        // dll.head.next.next.next targets node 30
        dll.insertBefore(dll.head.next.next.next, 25); 
        // Current sequence: 5 <-> 10 <-> 20 <-> 25 <-> 30

        // Verification Display
        dll.printForward();  // Expected: 5 <-> 10 <-> 20 <-> 25 <-> 30 <-> NULL
        dll.printBackward(); // Expected: 30 <-> 25 <-> 20 <-> 10 <-> 5 <-> NULL
    }
}
