package LinkedListConcept;

public class _18_LinkedListConcepts {

    Node head;
    class Node{
         int data;
         Node next;
         Node(int data){
             this.data = data;
             next= null;

         }
    }

    public void printmyLinkedList(){
        Node n= head;
        while(n!=null){
            System.out.println(n.data);
        n=n.next;

        }

    }
    public static void main(String[] args) {

        _18_LinkedListConcepts ll = new _18_LinkedListConcepts();
       Node first =  ll.new Node(12);
       ll.head=first;

        Node Second = ll.new Node(15);
        first.next= Second;

        Node Third = ll.new Node(10);
        Second.next= Third;

        ll.printmyLinkedList();

    }
}
