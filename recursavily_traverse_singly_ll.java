public class recursavily_traverse_singly_ll{
  Node head;
  public static  class Node{
    int data = 0;
    Node next = null;
    Node(int d){
     this.data = d;
    }
  }
  public static void main(String[] args) {
    recursavily_traverse_singly_ll ll = new recursavily_traverse_singly_ll();
    ll.head = new Node(0);
     Node one = new Node(1);
     Node two = new Node(2);
     Node  three = new Node(3);

      ll.head.next = one;
      one.next = two;
      two.next = three;

     recurse(ll.head);
  }
  public static  void recurse(Node head){
    if(head==null){
      return;
    }
    System.out.print(head.data +"->");

    recurse(head.next);
  }
}