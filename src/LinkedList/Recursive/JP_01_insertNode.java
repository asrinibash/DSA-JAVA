package LinkedList.Recursive;

import LinkedList.JP_01_SingleLinkedList;

public class JP_01_insertNode {
    public Node head;
    private int size;

    public  void insert(int val, int index){
        head=insert(val,index,head);
    }
    public  Node insert(int val, int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            return temp;
        }
        node.next=insert(val,--index,node.next);
        return node;
    }
    public  void display(){
        Node temp;
        temp=head;
        while( temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
    JP_01_insertNode ob=new JP_01_insertNode();
       ob.insert(12,0);
       ob.insert(11,1);
        ob.insert(10,2);
        ob.insert(9,3);
        ob.display();
    }

    class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
