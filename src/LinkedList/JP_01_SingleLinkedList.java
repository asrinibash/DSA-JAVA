package LinkedList;

//Making Custom linked list
public class JP_01_SingleLinkedList {

    private Node head;
    private Node tail;
    private int size=0;

    public JP_01_SingleLinkedList(){
        this.size=0;
    }


    //Insertion Of Single Linked list
    public void insertAtFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
            tail=head;
        size++;
    }

    public void insertAtEnd(int val) {
        if (tail == null){
            insertAtFirst(val);
        return;
    }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtPosition(int val,int index){
        if(index==0) {
            insertAtFirst(val);
            return;
        }
        else if(index==size){
            insertAtEnd(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
//        Node node=new Node(val,temp.next);
//        temp.next=node;
        //same thing
//          temp.next new Node(val,temp.next);
          size++;
    }


    //Deletion In Single Linked list

    public int deleteAtFirst(){
            int val = head.value;
            head = head.next;
            if(head==null)
                tail=null;
            size--;
            return val;
    }

    public int deleteAtEnd(){
        if(size<=1) {
           return deleteAtFirst();
        }
        Node previous=getNode(size-2);
        int val=tail.value;
        tail=previous;
        tail.next=null;
        return val;
    }

    public int deleteAtIndex(int index){
        if(index<=1)
            return deleteAtFirst();
        if(index==size-1)
            return deleteAtEnd();
         Node node=getNode(index-1);
         int val=node.next.value;
         node.next=node.next.next;
         return val;
    }
    public Node getNode(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public Node listSearch(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value)
                return node;
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp;
        temp=head;
        while( temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

     public class Node{
        private int value;
        private Node next;

        public Node(int value){
          this.value= value;
        }
        public Node(int value,Node next){
            this.value= value;
            this.next= next;
        }
    }
    public static void main(String[] args) {
        JP_01_SingleLinkedList list=new JP_01_SingleLinkedList();
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);
        list.insertAtEnd(99);
        list.insertAtPosition(33,3);
        list.display();
//        System.out.println(list.deleteAtFirst());
//        System.out.println(list.deleteAtEnd());
        System.out.println(list.deleteAtIndex(2));
        list.display();
        System.out.println(list.listSearch(22));
    }
}

