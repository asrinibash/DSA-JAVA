//package Trees.Problems;
//Q-129-leetcode
//public class JP_23_SumRootOfLeafNodes {
//    public int sumNumbers(TreeNode root) {
//        return helper(root,0);
//    }
//    private int helper(TreeNode node,int sum){
//        if(node ==null)
//            return 0 ;
//        sum=10*sum+node.val;
//
//        if(node.left==null && node.right==null)
//            return sum;
//
//        return helper(node.left,sum) + helper(node.right,sum);
//    }
//}
