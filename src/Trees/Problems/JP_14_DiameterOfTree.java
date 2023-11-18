//package Trees.Problems;
//Q-543_leetCode
//public class JP_14_DiameterOfTree {
//
//    int diameter=0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        height(root);
//        return diameter-1;
//    }
//    private int height (TreeNode node){
//        if(node==null)
//            return 0;
//        int leftHeight=height(node.left);
//        int rightHeight=height(node.right);
//        int dia=(leftHeight+rightHeight)+1;
//        diameter=Math.max(diameter,dia);
//
//        return Math.max(leftHeight,rightHeight)+1;
//
//    }
//}
