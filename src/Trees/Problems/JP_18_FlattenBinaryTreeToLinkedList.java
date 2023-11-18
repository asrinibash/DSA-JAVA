//package Trees.Problems;
//Q-114_leetcode
//
////public class JP_18_FlattenBinaryTreeToLinkedList {
////    public void flatten(TreeNode root) {
////        TreeNode current=root;
////        while(current!=null){
////            if(current.left!=null){
////                TreeNode temp=current.left;
////                while(temp.right!=null){
////                    temp=temp.right;
////                }
////                temp.right=current.right;
////                current.right=current.left;
////                current.left=null;
////            }
////            current=current.right;
////        }
////    }
////}
//
//// ArrayList<Integer> list=new ArrayList<>();
//// public void flatten(TreeNode root) {
////     if(root==null) return;
////  preOrder(root);
////  TreeNode dummyHead=new TreeNode();
////  TreeNode temp=dummyHead;
////  dummyHead.left=null;
////  int i=0;
////  while(i<list.size()){
////     temp.val=list.get(i);
////     temp.left=null;
////     temp.right=new TreeNode();
////     temp=temp.right;
////     i++;
////  }
////  root=dummyHead;
//
//// }
//// private void preOrder(TreeNode root){
////     if(root==null) return;
//
////     list.add(root.val);
////     preOrder(root.left);
////     preOrder(root.right);
//// }
//}
