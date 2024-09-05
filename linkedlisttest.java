class Node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
public class linkedlisttest {
    Node head;
    linkedlisttest(){
        head=null;
    }
    public void insertInfirst(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;

        while(current!=null){
            next=current.next;
           current.next=prev;
            prev=current ;
            current=next;
        }
        head=prev;

    }
    public void insertatpos(int pos,int val){
        Node newnode=new Node(val);
        if(pos==0){
            insertInfirst(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }

    public static void main(String[] args) {
        linkedlisttest list=new linkedlisttest();
        list.insertInfirst(2);
        list.insertInfirst(3);
        list.insertInfirst(4);
        list.insertInfirst(5);
        list.display();
        System.out.println();
        list.insertatpos(2, 100);
        list.display();
        System.out.println();
        list.reverse();
        list.display();
    }
}
