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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preorderList = new ArrayList<>();
        if(root == null) return preorderList;
        
        Stack<TreeNode> stackList = new Stack<>();
        stackList.push(root);
        
        while(!stackList.empty()){
            TreeNode curr = stackList.pop();
            preorderList.add(curr.val);
            
            if(curr.right != null) stackList.push(curr.right);
            if(curr.left != null) stackList.push(curr.left);
        }
        
        return preorderList;
    }
}