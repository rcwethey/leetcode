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
    public int maxDepth(TreeNode root) {
        //Recursive DFS Time: 0ms
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        
        //Iterative DFS Time: 2ms
        /**
            Stack<TreeNode> node_stack = new Stack();
            Stack<Integer> depth_stack = new Stack();

            node_stack.add(root);
            depth_stack.add(1);

            int maxDepth = 1;

            while(!node_stack.isEmpty()){
                int depth = depth_stack.pop();
                TreeNode currentNode = node_stack.pop();

                if(currentNode.right != null){
                    node_stack.add(currentNode.right);
                    depth_stack.add(depth+1);
                }

                if(currentNode.left != null){
                    node_stack.add(currentNode.left);
                    depth_stack.add(depth+1);
                }

                if(depth > maxDepth) maxDepth = depth;
            }

            return maxDepth;
        */
    }
}