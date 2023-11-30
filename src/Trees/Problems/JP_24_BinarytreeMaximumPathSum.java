//package Trees.Problems;
//
//Q-124-leetcode
//public class JP_24_BinarytreeMaximumPathSum {
//    int max=Integer.MIN_VALUE;
//    public int maxPathSum(TreeNode root) {
//        helper(root);
//        return max;
//    }
//    private int helper(TreeNode root){
//        if(root==null) return 0;
//
//        int leftSum=helper(root.left);
//        int rightSum=helper(root.right);
//
//        leftSum=Math.max(0,leftSum);
//        rightSum=Math.max(0,rightSum);
//
//        int pathSum= leftSum+ rightSum+ root.val;
//        max=Math.max(pathSum,max);
//        return Math.max(leftSum,rightSum)+ root.val;
//    }
//}
