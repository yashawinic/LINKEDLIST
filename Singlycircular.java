// "static void main" must be defined in a public class.
import java.util.*;
class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
    next=null;
  }
}
class ll{
   Node head=null;
    Node old=null;
  void ins(int val){   
    Node nn=new Node(val);
    if(head==null){
      head=nn;
      old=nn;
        nn.next=head;
    }else{
      old.next=nn;
        nn.next=head;
      old=nn;
    }
  }
  void dis(){
      if(head==null){
          return;
      }
      else{
          System.out.print(head.data+" ");
      }
      Node t=head.next;
      while(t!=head){
          System.out.print(t.data+" ");
          t=t.next;
      }
}
}
public class Singlycircular {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      ll a=new ll();
      while(sc.hasNext()){
        int d=sc.nextInt();
        a.ins(d);
      }
      a.dis();
  }
}
