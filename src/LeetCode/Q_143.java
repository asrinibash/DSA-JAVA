package LeetCode;
//Re-order List
public class Q_143 {
    private Node head;
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public Node getMid(Node head) {
        Node s = head;
        Node f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public Node reverseIteration(Node head){
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
        return head;
    }

    public void reOrderList(Node head){
        Node mid=getMid(head);
        Node hs=reverseIteration(head);
        Node hf=head;
        while(hf!=null && hs!=null){
            Node temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null){
            hf.next=null;
        }
    }
}
