public class search_Node{
 Node head;
  public static  class Node{
    int data = 0;
    Node next = null;
    Node(int d){
     this.data = d;
    }
  }
  public static void main(String[] args) {
    search_Node ll = new search_Node();
    ll.head = new Node(8);
    ll.head.next = new Node(20);
    ll.head.next.next = new Node(30);

   int position =  search(ll.head,20);
   System.out.println(position);
   Node temp = ll.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
  public static int search(Node head,int x){
    Node temp = head;
    int pos = 1;
    while(temp!=null){
      if(temp.data==x){
        return pos;
      }
      else{
        pos++;
      temp = temp.next;
      }
    }
    return pos;
  }
}