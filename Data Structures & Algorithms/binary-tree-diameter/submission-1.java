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
    private int max;
    public int diameterOfBinaryTree(TreeNode root) {
         diameter(root);
        return max;
    }

    private int diameter(TreeNode node) { 
        if (node == null) return -1;
        int left = diameter(node.left);

        int right = diameter(node.right);
        max = Math.max(max, left + right + 2);
        return 1+ Math.max(left, right);

        
    }

   
 }
