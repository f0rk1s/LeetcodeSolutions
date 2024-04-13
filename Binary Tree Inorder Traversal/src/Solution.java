import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




class Solution {
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
    List ans = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        recursiveInorderTraversal(root);
        return ans;
    }

    public void recursiveInorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        recursiveInorderTraversal(root.left);
        ans.add(root.val);
        recursiveInorderTraversal(root.right);
    }

}