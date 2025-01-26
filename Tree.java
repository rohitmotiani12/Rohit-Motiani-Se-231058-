 class TreeNode {
    String data;
     TreeNode left;
     TreeNode right;
    TreeNode(String data) {
        this .data =data;
    }
}class Tree {
     TreeNode root;
       public TreeNode tree() {
         root=new TreeNode("/");
         root.left=new TreeNode("*");
         root.left.left=new TreeNode("+");
         root.left.left.left=new TreeNode("5");
        root.left.left.right=new TreeNode("2");
         root.left.right=new TreeNode("-");
         root.left.right.left=new TreeNode("2");
          root.left.right.right=new TreeNode("1");
         root.right=new TreeNode("+");
          root.right.left=new TreeNode("2");
          root.right.right=new TreeNode("9");
           return root;

       }
       public void inOrder(TreeNode node) {
        if(node !=null) {
             inOrder(node.left);
              System.out.print(node.data+ " ");
            inOrder(node.right);
        }
    }
    public static void main(String args[])
    {
        Tree t=new Tree();
         t.tree();
         System.out.println("In-order traversal=");
          t.inOrder(t.root);
     }
 }