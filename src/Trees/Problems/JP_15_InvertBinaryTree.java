//package Trees.Problems;
//Q-226-Leetcode
//public class JP_15_InvertBinaryTree {
//    public TreeNode invertTree(TreeNode root) {
//        if(root==null)
//            return null;
//
//        root.left= invertTree(root.left);
//        root.right= invertTree(root.right);
//        TreeNode temp=root.left;
//        root.left=root.right;
//        root.right=temp;
//
//
//        return root;
//    }
//}
