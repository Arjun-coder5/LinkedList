
class detect_remove {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Function that detects loop in the list
    int detectAndRemoveLoop(Node node)
    {
        Node slow = node, fast = node;
        
        // Loop detection (Floyd's cycle-finding algorithm)
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                // Remove the loop
                removeLoop(slow, node);
                return 1; // Loop found and removed
            }
        }
        return 0; // No loop
    }

    // Function to remove loop
    void removeLoop(Node loop, Node head)
    {
        Node ptr1 = head;
        Node ptr2 = loop;

        // Move ptr1 to the head and keep ptr2 at the meeting point
        // Move both pointers one step at a time
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Now ptr1 and ptr2 are at the start of the loop
        // Move ptr2 one step ahead to find the last node in the loop
        ptr2 = ptr2.next;
        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }

        // Now ptr2 is at the last node in the loop
        // Remove the loop by setting the next of last node to null
        ptr2.next = null;
    }

    // Function to print the linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        detect_remove list = new detect_remove();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;

        // Detect and remove loop
        list.detectAndRemoveLoop(head);
        
        System.out.println("Linked List after removing loop:");
        list.printList(head);
    }
}