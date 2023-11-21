//package Trees.Problems;
//Q-230-leetcode
//public class JP_21_KthSmalletsInBST {
//    int count=0;
//    public int kthSmallest(TreeNode root, int k) {
//        if(root==null){
//            return -1;
//        }
//        Integer left=kthSmallest(root.left,k);
//        if(left!=-1)
//            return left;
//
//        count++;
//
//        if(count==k)
//            return root.val;
//
//        return kthSmallest(root.right,k);
//    }
//
//
//
//
//
//
//
//    // ArrayList<Integer> list=new ArrayList<>();
//    // public int kthSmallest(TreeNode root, int k) {
//    //     preOrder(root);
//    //     return list.get(k-1);
//    // }
//    // private void preOrder(TreeNode node){
//    //     if(node==null)
//    //     return;
//    //     preOrder(node.left);
//    //     list.add(node.val);
//    //     preOrder(node.right);
//    // }
//}
