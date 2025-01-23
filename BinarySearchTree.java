class BinarySearchTree {
    Node root;
    class Node {
        int value;
        Node left;
        Node right;
        public Node(int data) {
            this.value=data;
            this.left=null;
            this.right=null;
        }
    }
    public void insert(int value) {
        root=insertRec(root, value);
    }
    private Node insertRec(Node root, int value) {
        if (root==null) {
            root=new Node(value);
             return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        }
        else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    public int findMin() {
        return findMinRec(root);
    }
    private int findMinRec(Node root) {
        if (root.left==null) {
            return root.value;
        }
        return findMinRec(root.left);
    }
    public int findMax() {
        return findMaxRec(root);
    }
    private int findMaxRec(Node root) {
         if (root.right==null) {
             return root.value;
         }
        return findMaxRec(root.right);
    }
    public static void main(String[] args) {
         BinarySearchTree bst = new BinarySearchTree();
         bst.insert(8);
        bst.insert(10);
         bst.insert(50);
         bst.insert(40);
         bst.insert(70);
         bst.insert(60);
        bst.insert(990);
         System.out.println("Minimum value in the BST: " + bst.findMin());
          System.out.println("Maximum value in the BST: " + bst.findMax());
    }
}