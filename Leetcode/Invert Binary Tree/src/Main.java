public class Main {


     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
              this.left = left;
              this.right = right;
         }

     }
    public void constructTree(int[] arr) {

        TreeNode root = new TreeNode();

    }
    public TreeNode invertTree(TreeNode root) {
        if (root.left != null) {invertTree(root.left);}

        if (root.right != null) {invertTree(root.right);}
        TreeNode temp = new TreeNode();
        temp.left = root.left;
        root.left = root.right;
        root.right = temp.left;
        temp.left = null;
        temp = null;

        return root;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


}