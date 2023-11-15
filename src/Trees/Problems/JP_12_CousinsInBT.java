//package Trees.Problems;
//Q-993_leetcode
//public class JP_12_CousinsInBT {
//    public boolean isCousins(TreeNode root, int x, int y) {
//        TreeNode xx=findNode(root,x);
//        TreeNode yy=findNode(root,y);
//
//        return(
//                (findLevel(root,xx,0)==findLevel(root,yy,0)&& (!isSibling(root,xx,yy)))
//        );
//    }
//    private TreeNode findNode(TreeNode node,int x){
//        if(node==null)
//            return null;
//
//        if(node.val==x)
//            return node;
//
//        TreeNode n=findNode(node.left,x);
//        if(n!=null)
//            return n;
//        return findNode(node.right,x);
//    }
//
//    private boolean isSibling(TreeNode node,TreeNode xx,TreeNode yy){
//        if(node==null)
//            return false;
//        return (
//                (node.left==xx && node.right==yy)|| (node.left==yy && node.right==xx) || isSibling(node.left,xx,yy) || isSibling(node.right,xx,yy)
//        );
//    }
//    private int findLevel(TreeNode node,TreeNode xx, int lev){
//        if(node==null)
//            return 0;
//
//        if(node ==xx)
//            return lev;
//
//        int l=findLevel(node.left,xx,lev+1);
//        if(l!=0)
//            return l;
//        return findLevel(node.right,xx,lev+1);
//
//    }
//}
