package LeetCode;


import java.util.List;

public class Q_142 {

    private ListNode head;

    public class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public ListNode cycleStarts(ListNode head) {
        int lenght = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                lenght = cycleLength(slow);
                break;
            }
        }
        if(lenght==0)
            return null;
        //find the start node;
        ListNode f=head;
        ListNode s=head;
        while(lenght>0){
            s=s.next;
            lenght--;
        }
        //keep moving forward and they will meet at cycle start
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }

    private int cycleLength(ListNode head) {
        int lenght = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {

                ListNode temp = slow;
                do {
                    temp = temp.next;
                    lenght++;
                } while (temp != slow);
            }
        }
        return lenght;
    }
}
