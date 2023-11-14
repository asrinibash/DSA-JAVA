//package Trees.Problems;

//Q-107-leetcode

//public class JP_09_BT_LevelOrderTrav_2 {
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> result =new ArrayList<>();
//        if(root==null){
//            return result;
//        }
//        Queue<TreeNode> que=new LinkedList<>();
//        que.offer(root);
//        while(!que.isEmpty()){
//            int levelSize=que.size();
//            List<Integer> currentLevel=new ArrayList<>(levelSize);
//            for(int i=0;i<levelSize;i++){
//                TreeNode currentNode=que.poll();
//                currentLevel.add(currentNode.val);
//                if(currentNode.left!=null){
//                    que.offer(currentNode.left);
//                }
//                if(currentNode.right!=null){
//                    que.offer(currentNode.right);
//                }
//            }
//            result.add(0,currentLevel);
//        }
//        return result;
//    }
//}
