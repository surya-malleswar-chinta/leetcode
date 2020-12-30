/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int curVal;
    public TreeNode bstToGst(TreeNode root) {
        curVal = 0;
        revInOrder(root);
        return root;
    }
    
    void revInOrder(TreeNode root) {
        if (root == null) return;
        revInOrder(root.right);
        curVal += root.val;
        root.val = curVal;
        revInOrder(root.left);
    }
}