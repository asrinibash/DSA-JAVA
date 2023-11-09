package Trees.Problems;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;

public class JP_03_AverageLevelSum {
    public class TreeNode {
        private int val;
        private JP_01_BFS.Node left;
        private JP_01_BFS.Node right;

        TreeNode(int val) {
            this.val = val;
        }
    }
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> ans=new ArrayList<>();
//        if(root==null) return ans;
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//        double avg=0;
//        double sum=0;
//        int levelSize=0;
//        while(!queue.isEmpty()){
//            levelSize=queue.size();
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode=queue.poll();
//                sum+=currentNode.val;
//                if(currentNode.left!=null) queue.offer(currentNode.left);
//                if(currentNode.right!=null) queue.offer(currentNode.right);
//            }
//            avg=sum/levelSize;
//            sum=0;
//            ans.add(avg);
//        }
//        return ans;
//    }
}

