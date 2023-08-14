package LinkedList.Recursive;

public class JP_02_ReverseLinkedList {
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

    public void reverseRecursive(Node node){
      if(node==tail){
          head=tail;
          return;
      }
      reverseRecursive(node.next);
      tail.next=node;
      tail=node;
      tail.next=null;
    }
    public static void main(String[] args) {
        JP_02_ReverseLinkedList list=new JP_02_ReverseLinkedList();
        for (int i = 7; i >0 ; i--) {
            list.insertAtEnd(i);
        }
        list.display();
        list.reverseRecursive(list.head);
        list.display();
    }

}
