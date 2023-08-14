package LeetCode;

//Given LinkedList is palindrome or not
public class Q_234 {
    private Node head;
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
       public  Node getMid(Node head){
            Node midPrev=null;
            while(head!=null &&head.next!=null){
                midPrev=(midPrev!=null)?midPrev.next:head;
                head=head.next.next;
            }
            Node mid=midPrev.next;
            midPrev.next=null;
            return mid;
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

        public boolean isPalindrome(Node head){
            Node mid= getMid(head);
            Node headSecond=reverseIteration(mid);
            Node revHead=headSecond;
            while(head!=null && headSecond!=null){
                if(head.value!= headSecond.value)
                    break;
                else{
                    head=head.next;
                    headSecond=headSecond.next;
                }
            }
            reverseIteration(revHead);
            return head==null ||headSecond==null;
        }
    }
