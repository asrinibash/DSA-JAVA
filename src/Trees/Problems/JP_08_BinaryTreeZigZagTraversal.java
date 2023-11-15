//package Trees.Problems;
//
//public class JP_08_BinaryTreeZigZagTraversal {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result =new ArrayList<>();
//        if(root==null){
//            return result;
//        }
//        boolean reverse=false;
//        Deque<TreeNode> que=new LinkedList<>();
//        que.offer(root);
//        while(!que.isEmpty()){
//            int levelSize=que.size();
//            List<Integer> currentLevel=new ArrayList<>(levelSize);
//            for(int i=0;i<levelSize;i++){
//                if(!reverse){
//                    TreeNode currentNode=que.pollFirst();
//                    currentLevel.add(currentNode.val);
//                    if(currentNode.left!=null) que.offerLast(currentNode.left);
//                    if(currentNode.right!=null) que.offerLast(currentNode.right);
//                }
//                else{
//                    TreeNode currentNode=que.pollLast();
//                    currentLevel.add(currentNode.val);
//                    if(currentNode.right!=null) que.offerFirst(currentNode.right);
//                    if(currentNode.left!=null) que.offerFirst(currentNode.left);
//                }
//            }
//            result.add(currentLevel);
//            reverse=!reverse;
//        }
//        return result;
//    }
//}
