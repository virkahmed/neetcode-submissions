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
    private List<List<Integer>> level;
    public List<List<Integer>> levelOrder(TreeNode root) {
        level = new ArrayList<>();
        dfs(root,0);
        return level;
    }


    private void dfs(TreeNode node, int lvl) { 
        if (node == null) 
            return;
        if (level.size() == lvl) { 
            level.add(lvl, new ArrayList<>());

        }

        level.get(lvl).add(node.val);
        dfs(node.left, lvl+1);
        dfs(node.right, lvl+1);

        return;

        

    }
}
