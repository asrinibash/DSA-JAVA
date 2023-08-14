package LinkedList;

public class JP_02_DoublyLinkedList {
    int size = 0;
    private Node head;

    public static void main(String[] args) {
        JP_02_DoublyLinkedList list = new JP_02_DoublyLinkedList();
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);

        list.insertAtLast(99);

        list.insertAfterValue(99,60);
        list.display();
        list.displayPrev();
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertAtLast(int value) {
        Node node = new Node(value);
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insertAfterValue(int after, int value) {
        Node prev = listSearch(after);
        if(prev==null) {
            System.out.println("node doesn't Exist");
            return;
        }
        Node node = new Node(value);
        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
        if(node.next!=null)
         node.next.prev = node;
        size++;
    }

    public Node listSearch(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) return node;
            node = node.next;
        }
        return null;
    }

    public void display() {
        JP_02_DoublyLinkedList.Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayPrev() {
        JP_02_DoublyLinkedList.Node temp;
        temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {
            System.out.print(last.value + " <- ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
