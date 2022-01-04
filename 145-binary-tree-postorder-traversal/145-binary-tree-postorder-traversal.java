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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> preorderList = new ArrayList<>();
        if(root == null) return preorderList;
        
        Stack<TreeNode> stackList = new Stack<>();
        TreeNode curr = root;
        
        while(true){
            if(curr != null){
                if(curr.right != null) stackList.push(curr.right);
                stackList.push(curr);
                curr = curr.left;
                continue;
            }
            
            if(stackList.empty()) return preorderList;
            curr = stackList.pop();
        
            if(curr.right != null && !stackList.empty() && curr.right == stackList.peek()){
                stackList.pop();
                stackList.push(curr);
                curr = curr.right;
            }else{
                preorderList.add(curr.val);
                curr = null;
            }
        }
    }
}