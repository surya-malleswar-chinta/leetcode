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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        inOrder(root1, q1);
        inOrder(root2, q2);
        List<Integer> sol = new ArrayList<>();
        int val;
        while(!q1.isEmpty() || !q2.isEmpty()) {
            if (!q1.isEmpty() && !q2.isEmpty()) {
                if (q1.peek() < q2.peek()) {
                   val = q1.poll(); 
                } else {
                    val = q2.poll();
                }
            } else if (q1.isEmpty()) {
                 val = q2.poll();
            } else {
                val = q1.poll();
            }
            sol.add(val);
        }
        return sol;
    }
    
    public void inOrder(TreeNode root, Queue<Integer> queue) {
        if (root == null) return;
        inOrder(root.left, queue);
        queue.offer(root.val);
        inOrder(root.right, queue);
    }
}