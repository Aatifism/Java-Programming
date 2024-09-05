class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
public class Linkedlist{
    Node head;
    Linkedlist(){
        head=null;
    }
    public void insertatbeg(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }

    }

    public void insertatpos(int pos,int val){
       Node temp = head;
       Node newnode=new Node(val);
       if(pos==0){
        insertatbeg(val);
        return;
       }

       for(int i=1;i<pos;i++){
        temp=temp.next;
       }
       if(temp==null){
        System.out.println("Invalid position");
        return;
       }
       newnode.next=temp.next;
       temp.next=newnode;
    }
    public void delete(int pos){
        if(head==null){
            System.out.println("The list is empty");
        }
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        for(int i=1;i<=pos;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        Linkedlist list = new Linkedlist();
        list.insertatbeg(10);
        list.insertatbeg(12);
        list.insertatbeg(14);
        list.insertatbeg(16);
        list.insertatbeg(18);
        list.display();
        System.out.println();
        list.delete(0);
        list.display();

    }

}