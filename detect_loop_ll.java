class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
public class detect_loop_ll {
  public static void main(String[] args) {
     Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

      
        head.next.next.next.next = head.next; 

       
        if (detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
    public static boolean detectLoop( Node head){
      if(head==null||head.next==null){
        return false;
      }
      Node slow = head;
      Node fast = head;

      while (fast!=null&&fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        
        if(slow==fast){
          return  true;
        }
      }
      return false;
    }
  }
