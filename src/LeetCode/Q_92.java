package LeetCode;

public class Q_92 {
    public Node head;
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

        public Node(int value,Node next) {
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

    public Node reverseBetween(Node head,int left,int right){
       if(left==right){
           return head;
       }
       Node current=head;
       Node prev=null;
        for (int i = 0; current!=null&&i < left-1 ; i++) {
            prev=current;
            current=current.next;
        }
        Node last=prev;
        Node newEnd=current;

        Node after = current.next;
        for (int i = 0;current!=null && i < right-left+1; i++) {
            current.next=prev;
            prev=current;
            current=after;
            if(after!=null)
                after=after.next;
        }
        if(last!=null)
            last.next=prev;

        newEnd.next=current;
        return head;
    }
    public static void main(String[] args) {
        Q_92 list=new Q_92();
        for (int i = 1; i <7 ; i++) {
            list.insertAtEnd(i);
        }
        list.display();
      list.head=list.reverseBetween(list.head,2,4);
        list.display();
    }
}
