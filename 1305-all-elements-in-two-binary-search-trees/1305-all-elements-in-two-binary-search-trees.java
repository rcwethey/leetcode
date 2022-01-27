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
    
    public PriorityQueue<Integer> finalQueue = new PriorityQueue<>(Collections.reverseOrder());
    public List<Integer> finalList = new ArrayList<>();
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        //Traverse one tree and add all elements to Priority Queue.
        if(root1 != null) helper(root1);
        
        //Traverse second treee and add all elementrs to Priority Queue.
        if(root2 != null) helper(root2);
        
        //fill list with queue
        while(!finalQueue.isEmpty()) finalList.add(0,finalQueue.poll());
        
        return finalList;
        
    }
    
    public void helper(TreeNode root){
        if(root != null){
            helper(root.left);
            finalQueue.add(root.val);
            helper(root.right);
        }
    }
}