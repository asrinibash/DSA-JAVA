package LinkedList;

public class JP_06_ReverseLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public class Node {
        private  int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null)
            tail = head;
        size++;
    }

    public void insertAtEnd(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void reverseIteration(){
        Node present=head;
        Node after=head.next;
        Node prev=null;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=after;
            if(after!=null)
             after=after.next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        JP_06_ReverseLinkedList list=new JP_06_ReverseLinkedList();
        for (int i = 7; i >0 ; i--) {
            list.insertAtEnd(i);
        }
        list.display();
        list.reverseIteration();
        list.display();
    }

}
