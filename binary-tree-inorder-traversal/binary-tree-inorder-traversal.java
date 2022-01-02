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
    ArrayList<Integer> inorderNodes = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) helper(root);
        return inorderNodes; 
    }
    
    public void helper(TreeNode p){
        if(p.left!=null) helper(p.left);
        inorderNodes.add(p.val);
        if(p.right!=null) helper(p.right);
    }
}