//package Trees.Problems;
//
//Q-116-leetcode
//
//public class JP_10_PopulatingEachRightPointer {
//    public Node connect(Node root) {
//        if (root == null) {
//            return root;
//        }
//        Queue<Node> que = new LinkedList<>();
//        que.offer(root);
//        Node currentNode=null;
//        while (!que.isEmpty()) {
//            int levelsize = que.size();
//            for (int i = 0; i < levelsize; i++) {
//                currentNode = que.poll();
//                if (currentNode.left != null)  que.offer(currentNode.left);
//                if (currentNode.right != null) que.offer(currentNode.right);
//                if(i==levelsize-1)
//                    currentNode.next=null;
//                else
//                    currentNode.next=que.peek();
//            }
//        }
//        return root;
//    }


//Efficient way:-
//public Node connect(Node root){
//        if(root==null){
//        return null;
//        }
//        Node leftMost=root;
//
//        while(leftMost.left!=null){
//        Node current=leftMost;
//        while(current!=null){
//        current.left.next=current.right;
//        if(current.next!=null){
//        current.right.next=current.next.left;
//        }
//        current=current.next;
//        }
//        leftMost=leftMost.left;
//        }
//        return root;
//        }
//}
