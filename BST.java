class BST {
    Node root;
    class Node {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
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
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right=insertRec(root.right, value);
        }
        return root;
    }
    public boolean search(int value) {
        return searchRec(root, value);
    }
    private boolean searchRec(Node root, int value) {
        if (root==null) {
            return false;
        }
        if (root.data==value) {
            return true;
        }
          return value < root.data? searchRec(root.left, value) : searchRec(root.right, value);
     }
     public static void main(String[] args) {
         BST bst =new BST();
         bst.insert(50);
          bst.insert(30);
        bst.insert(20);
          bst.insert(40);
         bst.insert(70);
         bst.insert(60);
         bst.insert(80);
         System.out.println(bst.search(40) ? "Element  found in the BST." : "Element  not found in the BST.");
          System.out.println(bst.search(90) ? "Element found in the BST." : "Element  not found in the BST.");
     }
}