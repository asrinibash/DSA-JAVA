//package Trees.Problems;
////DFS traversal using iteration
//
//import java.util.Stack;
//
//public class JP_07_DFS_PreOrderTravUsingIteration {
//    public void preOrder(TreeNode root){
//        if(root==null) return;
//        Stack<Integer> stc=new Stack<>();
//        stc.push(root.val);
//        while (!stc.isEmpty()){
//           TreeNode remove=stc.pop();
//            System.out.print(remove+" ");
//            if(node.right!=null) {
//                stc.push(root.right);
//            }if(node.left!=null) {
//                stc.push(root.left);
//            }
//        }
//    }
//}
