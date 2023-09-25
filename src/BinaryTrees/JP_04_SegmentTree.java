package BinaryTrees;

public class JP_04_SegmentTree {
   private class Node {
        private int data;
        private  int startInterval;
        private  int endInterval;
        private Node left;
        private Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public JP_04_SegmentTree(int[] arr) {
        //create segment the tree using the array
        this.root = constructTree(arr, 0, arr.length - 1);

    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) { // it means the node is leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        //create new node with index you are at
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "Left Interval[ " + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + "  |--->  ";
        } else {
            str += "No left child";
        }
        //for current node:
        str = str + "root Interval[ " + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + "  <---|  ";

        if (node.right != null) {
            str = str + "right Interval[ " + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data + "]";
        } else {
            str += "No right child";
        }
        System.out.println(str);
        if (node.left != null)
            display(node.left);
        if (node.right != null)
            display(node.right);


    }

    public int additionRange(int start,int end){
        return additionRange(this.root,start,end);
    }
    private int additionRange(Node node, int start, int end) {
        if (node.startInterval >= start && node.endInterval <= end) {
            //it means node completely lying inside query
            return node.data;
        } else if (node.startInterval > end || node.endInterval < start) {
            //it means node is outside the query Interval
            return 0;
        } else {
            return this.additionRange(node.left, start, end) + this.additionRange(node.right, start, end);
        }
    }

    //update
    public int update(int index,int value){
        this.root.data=update(root,index,value);
        return  this.root.data;
    }
    private int update(Node node,int index,int value){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.data=value;
            }else {
                int left = update(node.left, index, value);
                int right = update(node.right, index, value);
                node.data = left + right;
            }
            return node.data;
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        JP_04_SegmentTree tree=new JP_04_SegmentTree(arr);
//        tree.display();
        System.out.println(tree.additionRange(1,6));
    }

}


