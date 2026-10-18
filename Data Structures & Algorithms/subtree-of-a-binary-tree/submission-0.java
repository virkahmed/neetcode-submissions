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
    private boolean match(TreeNode p, TreeNode q) { 
        if (p == null || q == null) { 
            if (p == null && q == null) { 
                return true;
            }
            return false;


        }
        if (p.val != q.val) { 
            return false;

        }
        if (!match(p.left, q.left))
            return false;
        if (!match(p.right, q.right))
            return false;
        return true;

    }  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (match(root, subRoot))
            return true;
        if (root == null)
            return false;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
