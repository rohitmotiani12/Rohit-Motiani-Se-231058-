 public class BSTree {
     class BSTNode {
         int data;
         BSTNode left;
         BSTNode right;

         BSTNode(int data)
         {
             this.data=data;
             this.left=null;
              this.right=null;
        }
    }
    public BSTNode sortedArrayToBST(int[] num)
    {
        return build(num, 0, num.length - 1);
    }
    private BSTNode build(int[] num, int l, int r) {
        if (l > r)
        {
            return null;
        }
        int mid=l + (r - l) / 2;
        BSTNode node=new BSTNode(num[mid]);
        node.left=build(num, l, mid - 1);
        node.right=build(num, mid + 1, r);
        return node;
    }
    public void inOrderTraversal(BSTNode node)
    {
        if (node !=null) {
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }
    public static void main(String[] args) {
        BSTree converter=new BSTree();
        int[] sortedArray={1, 2, 3, 4, 5, 6, 7};
        BSTNode root = converter.sortedArrayToBST(sortedArray);
        converter.inOrderTraversal(root);
    }
}