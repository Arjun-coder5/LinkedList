public class remove_duplicate_sorted_ll { 
    Node head; 

    class Node { 
        int data; 
        Node next; 
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 

    public static void main(String[] args) { 
       
        remove_duplicate_sorted_ll llist = new remove_duplicate_sorted_ll(); 
        
       
        llist.push(20); 
        llist.push(13); 
        llist.push(13); 
        llist.push(11); 
        llist.push(11); 
        llist.push(11); 

        System.out.println("List before removal of duplicates:"); 
        llist.printList(); 

        llist.removeDuplicates(); 

        System.out.println("List after removal of elements:"); 
        llist.printList(); 
    } 

    public void printList() { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 

    void removeDuplicates() { 
        Node curr = head; 
        
        // Traverse through the entire list
        while (curr != null && curr.next != null) { 
            // If duplicate found, skip the next node
            if (curr.data == curr.next.data) { 
                curr.next = curr.next.next; 
            } else { 
                // Advance pointer only if no duplicate was skipped
                curr = curr.next; 
            } 
        } 
    } 

    public void push(int new_data) { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
}
