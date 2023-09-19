package LinkedList.Recursive;

public class JP_03_Merge_2_Sorted_linkedList {

    static class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
    private Node mergeLists(Node head1, Node head2) {

        if (head1 == null && head2 == null) {
            return null;
        }
        if (head1 != null && head2 == null) {
            return head1;
        }
        if (head2 != null && head1 == null) {
            return head2;
        }

        Node head;
        if (head1.data <= head2.data) {
            head = new Node(head1.data);
            head.next = mergeLists(head1.next, head2);
        } else {
            head = new Node(head2.data);
            head.next = mergeLists(head1, head2.next);
        }
        return head;
    }
}
