class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
public class interaction_ll {
  public static void main(String[] args) {
    Node common = new Node(15);
        common.next = new Node(30);

       
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = common; 

    
        Node head2 = new Node(10);
        head2.next = common; 

        
        Node intersection = getIntersectionNode(head1, head2);

        if (intersection != null) {
            System.out.println("The intersection node data is: " + intersection.data);
        } else {
            System.out.println("The lists do not intersect.");
        }
    }
    public static Node getIntersectionNode(Node head1,Node head2){
        if (head1 == null || head2 == null) {
            return null;
        }
        int len1 = 0, len2 = 0;
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != null) {
            len1++;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            len2++;
            ptr2 = ptr2.next;
        }
        ptr1 = head1;
        ptr2 = head2;
         if (len1 > len2) {
            int diff = len1 - len2;
            for (int i = 0; i < diff; i++) {
                ptr1 = ptr1.next;
            }
        } else {
            int diff = len2 - len1;
            for (int i = 0; i < diff; i++) {
                ptr2 = ptr2.next;
            }
        }
          while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) {
                return ptr1; // Intersection found!
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
    }
  }