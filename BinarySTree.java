import java.util.*;
class TNode
{
     int data;
     TNode left;
     TNode right;
     TNode(int data)
     {
     this.data = data;
     this.left=null;
     this.right=null;
    }
}
class BinarySTree {
    public void binaryTreeToBST(TNode root) {
        int n = countNodes(root);
         int val[] =new int[n];
        inOrderTraversal(root, val, new int[]{0});
         Arrays.sort(val);
         inOrderAssign(root, val, new int[]{0});
    }
    private int countNodes(TNode node) {
        if (node==null) {
            return 0;
        }
        return 1+countNodes(node.left)+countNodes(node.right);
    }
    private void inOrderTraversal(TNode node, int[] values, int[] index) {
        if (node==null){
            return;}
        inOrderTraversal(node.left, values, index);
        values[index[0]++]=node.data;
        inOrderTraversal(node.right, values, index);
    }
    private void inOrderAssign(TNode node, int[] values, int[] index) {
        if (node==null) return;
        inOrderAssign(node.left, values, index);
          node.data=values[index[0]++];
        inOrderAssign(node.right, values, index);
    }
    private void inOrderPrint(TNode node)
    {
        if(node==null) return;
        inOrderPrint(node.left);
        System.out.print(node.data + " ");
        inOrderPrint(node.right);
    }
    public static void main(String[] args)
    {
        TNode root=new TNode(10);
        root.left=new TNode(30);
        root.right=new TNode(75);
         root.left.left=new TNode(45);
        root.left.right=new TNode(39);
        BinarySTree converter=new BinarySTree();
        converter.binaryTreeToBST(root);
         converter.inOrderPrint(root);

    }
}