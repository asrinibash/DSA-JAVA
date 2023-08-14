package LinkedList;

public class JP_03_CircularLinkedList {
    Node head;
    Node tail;

    public JP_03_CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertValue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void deleteByValue(int value){
        Node node=head;
        if(node==null)
            return;
        if(node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        while(node.next.value!=value)
            node=node.next;
        if(node.next==tail){
            tail=node;
        }
        node.next=node.next.next;
    }

    public void display() {
        if (head != null) {
            Node node = head;
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
        } else System.out.println("LinkedList is not Exist");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        JP_03_CircularLinkedList list=new JP_03_CircularLinkedList();
        list.insertValue(22);
        list.insertValue(33);
        list.insertValue(44);
        list.insertValue(55);
        list.deleteByValue(55);
        list.deleteByValue(22);
        list.display();
    }
}
