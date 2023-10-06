package Trees.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JP_02_BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        private int val;
        private JP_01_BFS.Node left;
        private JP_01_BFS.Node right;

        TreeNode(int val) {
            this.val = val;
        }
    }
//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> result =new ArrayList<>();
//        if(root==null){
//            return result;
//        }
//        Queue<TreeNode> que=new LinkedList<>();
//        que.offer(root);
//        while(!que.isEmpty()){
//            int levelSize=que.size();
//            List<Integer> currentLevel=new ArrayList<>(levelSize);
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode=que.poll();
//                currentLevel.add(currentNode.val);
//                if(currentNode.left!=null){
//                    que.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    que.offer(currentNode.right);
//                }
//            }
//            result.add(currentLevel);
//        }
//        return result;
//    }
}
