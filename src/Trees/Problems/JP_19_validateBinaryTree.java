//package Trees.Problems;
//
//public class JP_19_validateBinaryTree {
//    public boolean isValidBST(TreeNode root) {
//        return helper(root,null,null);
//    }
//    private boolean helper(TreeNode root,Integer low,Integer high){
//        if(root==null) return true;
//        if(low!=null && root.val<=low){
//            return false;
//        }
//        if(high!=null  && root.val>=high){
//            return false;
//        }
//        boolean  right=helper(root.right,root.val,high);
//        boolean  left=helper(root.left,low,root.val);
//
//
//        return left && right;
//    }
//}
