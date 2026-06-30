public class delete_firstNode {
   Node head;
  public static  class Node{
    int data = 0;
    Node next = null;
    Node(int d){
     this.data = d;
    }
  }
  public static void main(String[] args) {
    delete_firstNode ll = new delete_firstNode();
    ll.head = new Node(0);
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);

    ll.head.next = one;
    one.next = two;
    two.next = three;

    ll.delete();
 

     for(Node temp = ll.head;temp!=null;temp = temp.next){
       System.out.print(temp.data+"->");

     }
     System.out.println("Null");

  
  }
  public  void delete(){
    if(head==null){
      return ;
    }
   head = head.next;
  }
}
