package BinaryTrees;

public class JP_02_ImplementationOfBST {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private Node root;

    public JP_02_ImplementationOfBST() {

    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (root == null) {
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left, "Left Child of " + node.getValue());
    }

    public void insertion(int value) {
        root = insertion(root, value);
    }

    private Node insertion(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insertion(node.left, value);
        }
        if (value > node.value) {
            node.right = insertion(node.right, value);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void displays() {
        displays(root, "Root Node is : ");
    }

    private void displays(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        displays(node.left, "Left node of " + node.value + " : ");
        displays(node.right, "Right node of " + node.value + " : ");
    }

    public void populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.insertion(arr[i]);
        }
    }

    public void populatedSorted(int[] arr) {
        populatedSorted(arr, 0, arr.length);
    }

    private void populatedSorted(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;    //time complexity: n * log(n)
        this.insertion(arr[mid]);
        populatedSorted(arr, start, mid);
        populatedSorted(arr, mid + 1, end);
    }

    //Traversal : preOrder,inOrder,postOrder

    public void preOrder(){
        this.preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null)                    //Use Cases:
            return;                       // 1.Use for evaluating math Expression
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
       this.inOrder(root);
    }

    private void inOrder(Node node){
        if(node==null)                    //Use Cases:
            return;                       // 1.Use for getting Sorted order element
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder(){
        this.postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null)                    //Use Cases:
            return;                       // 1.Use for deleting a node (take care of children first then care about node)
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }



    public static void main(String[] args) {
        JP_02_ImplementationOfBST tree = new JP_02_ImplementationOfBST();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        tree.populatedSorted(arr);
        tree.displays();
    }
}
