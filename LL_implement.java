public class LL_implement{
  Node head;
  public static   class Node{
    int data;
    Node next;
       Node(int d){
      data = d;
      next = null;
    }
  }
  public static void main(String[] args) {
      LL_implement ll = new LL_implement();
      ll.head = new Node(1);
      Node one = new Node(2);
      Node two = new Node(3);
      Node three = new Node(4);


       ll.head.next = one;
       one.next = two;
       two.next = three;

      ll.print();
  }
  public void print(){
   Node n = head;
   while(n!=null){
    System.out.print(n.data+"->");
    n = n.next;
   }
  }

}