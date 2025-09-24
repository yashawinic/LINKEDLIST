// "static void main" must be defined in a public class.
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
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
        }
        else{
            old.right=nn;
            nn.left=old;
            old=nn;
        }
    }
    void dis(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
    }
    // void Revdis(){
    //     Node temp=old;
    //     while(temp!=null){
    //         System.out.print(temp.data+" ");
    //         temp=temp.left;
    //     }
    // }
}
public class Doubly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll a=new ll();
        while(sc.hasNext()){
            int d= sc.nextInt();
            a.ins(d);
        }
        a.dis();
    }
}
