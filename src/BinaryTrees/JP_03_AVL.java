package BinaryTrees;

public class JP_03_AVL {
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

    public JP_03_AVL() {

    }

    public int getHeight(){
        return getHeight(root);
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

        return rotate(node);
    }

    //Rotation:
    private Node rotate(Node node) {
        if (getHeight(node.left) - getHeight(node.right) > 1) {
            //left heavy
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                //left-left case
                return rightRotate(node);
            }
            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if (getHeight(node.left) - getHeight(node.right) < -1) {
            //right heavy
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                //right-right case
                return leftRotate(node);
            }
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                //right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;
        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);
        return c;
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

    public static void main(String[] args) {
        JP_03_AVL tree = new JP_03_AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insertion(i);
        }
        System.out.println(tree.getHeight());
    }
}


