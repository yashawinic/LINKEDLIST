// "static void main" must be defined in a public class.

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
        if (head==null){
            head=nn;
            old=nn;
        }
        else{
            old.next=nn;
            old=nn;
        }
        
    }
    void dis(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}

public class Singly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ll a=new ll();
        while (sc.hasNext()){
            int d=sc.nextInt();
            a.ins(d);
        }
        a.dis();
    }
}
