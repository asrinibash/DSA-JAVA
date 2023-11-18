package Trees.Problems;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//find right successor of the given node value- asked by google
public class JP_04_google {
    public class TreeNode {
        private int val;
        private JP_01_BFS.Node left;
        private JP_01_BFS.Node right;

        TreeNode(int val) {
            this.val = val;
        }
    }

//    public int rightSuccessor(TreeNode root, int key) {
//        if (root == null) {
//            return ans;
//        }
//        Queue<TreeNode> que = new LinkedList<>();
//        que.offer(root);
//        TreeNode currentNode=null;
//        while (!que.isEmpty()) {
//            int levelsize = que.size();
//            for (int i = 0; i < levelsize; i++) {
//                currentNode = que.poll();
//                if (currentNode.left != null) {
//                    que.offer(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    que.offer(currentNode.right);
//                }
//            }
//           if(currentNode.val==key)
//               break;
//        }
//        assert que.peek() != null;
//        return que.peek().val;
//    }
}
