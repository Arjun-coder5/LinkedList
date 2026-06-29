

public class singly_LL {
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
    singly_LL ll = new singly_LL();
    ll.head = new Node(1);
    Node one = new Node(2);
    Node two = new Node(3);

    ll.head.next = one;
    one.next = two;
    int newData = 0;
    int num = 5;
    int number  = 10;
   //ll.front(newData);
   //ll.after(one, num);
   ll.end(number);
  }
  // Insertion at front : 
  // public  void  front(int newData){
  // Node num = new Node(newData);
  // num.next = head;
  // head = num;
  // Node n = head;
  // while(n!=null){
  //   System.out.print(n.data+"->");
  //   n = n.next;
  // }
  // }

  // Insertion after a node : 
  // public void after(Node prev,int var){
  // if(prev==null){
  //   System.out.println("Prev Node is Null . ");
  // }
  //  Node newNode = new Node(var);
  //  newNode.next = prev.next;
  //  prev.next = newNode;
   
  // Node n = head;
  // while(n!=null){
  //   System.out.print(n.data+"->");
  //   n = n.next;
  // }
  // }

  // Insertion at the end : 
  public void end(int num){
   Node last = head;
   Node k = new Node(num);
   if (head == null) 
    { 
        head = k; 
        return; 
    } 
    k.next = null;
   while(last.next!=null){
    last = last.next;
    
   }
    last.next = k;
    Node n = head;
  while(n!=null){
    System.out.print(n.data+"->");
    n = n.next;
  }
  }
}
