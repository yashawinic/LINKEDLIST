// "static void main" must be defined in a public class.
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
            head.left=nn;
            nn.right=head;
        }
        else{
            old.right=nn;
            nn.left=old;
            old=nn;
            head.left=nn;
            nn.right=head;
        }
    }
    void dis(){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        Node t=head.right;
        while(t!=head){
            System.out.print(t.data+" ");
            t=t.right;
        }
    }
    // void Revdis(){
    //     Node temp=old;
    //     if(old==null){
    //         return;
    //     }
    //     System.out.print(old.data+" ");
    //     temp=temp.left;
    //     while(temp!=old){
    //         System.out.print(temp.data+" ");
    //         temp=temp.left;
    //     }
    // }
}
public class Doublycircular {
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
