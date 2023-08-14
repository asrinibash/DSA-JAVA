package LinkedList;

public class JP_05_BubbleSort {
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
        private int value;
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

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0)
            return;
        if (col < row) {
            Node first = getNode(col);
            Node second = getNode(col + 1);
            if (first.value > second.value) {
                //swap
                if (first == head) {
                    head = second;
                    first.next=second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
                bubbleSort(row, col + 1);
            }
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public static void main(String[] args) {
        JP_05_BubbleSort list=new JP_05_BubbleSort();
        for (int i = 7; i >0 ; i--) {
            list.insertAtEnd(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
