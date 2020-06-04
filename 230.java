/*Kth Smallest Element in a BST */

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
	int result;
	int count = 0;
	public int kthSmallest(TreeNode root, int k) {
		dfs(root, k);
		return result;
	}

	void dfs(TreeNode root, int k) {
		if (root == null) return;
		dfs(root.left, k);
		if (++count == k) {
			result = root.val;
			return;
		}
		dfs(root.right, k);
	}

	/*
	Another approach of stack inorder traversal through stack
	
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<>();
		int count = 0;
		while(root != null || !stack.isEmpty()) {
			while(root != null) {
				stack.push(root.left);
				root = root.left;
			}
			root = stack.pop();
			count++;
			if(count == k) return root.val;
			root = root.right;
		}
	}
	*/
}
