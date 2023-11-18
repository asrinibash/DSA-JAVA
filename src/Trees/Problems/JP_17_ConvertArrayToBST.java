//package Trees.Problems;
//Q-108-leetcode
//public class JP_17_ConvertArrayToBST {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        TreeNode root=helper(0,nums.length-1,nums);
//        return root;
//    }
//    private TreeNode helper(int s,int l,int[] nums){
//        if(s>l){
//            return null;
//        }
//        int mid=(s+l)/2;
//        TreeNode root=new TreeNode(nums[mid]);
//        root.left=helper(s,mid-1,nums);
//        root.right=helper(mid+1,l,nums);
//
//        return root;
//    }
//}
