//package Trees.Problems;
//Q-236-leetcode
//public class JP_20_LowestCommonAncestorOfBT {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null) return null;
//        if(root ==p || root == q){
//            return root;
//        }
//        TreeNode left=lowestCommonAncestor(root.left,p,q);
//        TreeNode right=lowestCommonAncestor(root.right,p,q);
//        if(left!=null && right!=null)
//            return root;
//
//        return left==null?right:left;
//    }
//}
