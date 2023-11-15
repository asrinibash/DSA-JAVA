//package Trees.Problems;
//Q-199-Leetcode
//public class JP_11_BinaryTreeRghtView {
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> list=new ArrayList<>();
//        if(root == null ){
//            return list;
//        }
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int levelSize=queue.size();
//            for(int i=0;i<levelSize;i++){
//                TreeNode current=queue.poll();
//                if(current.left!=null) queue.offer(current.left);
//                if(current.right!=null) queue.offer(current.right);
//                if(i==levelSize-1){
//                    list.add(current.val);
//                }
//            }
//        }
//        return list;
//    }
//}
