public class delete_lastNode{
  Node head;
  public static  class Node{
    int data = 0;
    Node next = null;
    Node(int d){
     this.data = d;
    }
  }
  public static void main(String[] args) {
    delete_lastNode ll = new delete_lastNode();
    ll.head = new Node(0);
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);

    ll.head.next = one;
    one.next = two;
    two.next = three;

    ll.last();
      for (Node temp = ll.head; temp != null; temp = temp.next) {
       System.out.print(temp.data + " -> ");
    }
    System.out.println("Null");
  
  }
  
  public void last(){
     if (head == null) {
      return;
    }
     if (head.next == null) {
      head = null;
      return;
    }
    Node temp = head;
    while(temp.next.next!=null){
      temp = temp.next;
    }
    temp.next = null;
  }
}