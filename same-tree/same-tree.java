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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p == null && q != null) || (p != null && q == null)) return false;
        
        Stack<TreeNode> pStack = new Stack();
        Stack<TreeNode> qStack = new Stack();
        Stack<Integer> pNumStack = new Stack();
        Stack<Integer> qNumStack = new Stack();
        
        pStack.add(p);
        pNumStack.add(1);
        qStack.add(q);
        qNumStack.add(1);
        
        while(!pStack.empty() && !qStack.empty()){
            TreeNode currP = pStack.pop();
            Integer currPNum = pNumStack.pop();
            TreeNode currQ = qStack.pop();
            Integer currQNum = qNumStack.pop();
            
            //System.out.println("PNode: " + currP.val + ", QNode: " + currQ.val + ", Pval: " + currPNum + ", Qval: " + currQNum);
            
            if(currP.left != null && currQ.left == null) return false;
            if(currP.left == null && currQ.left != null) return false;
            if(currP.val != currQ.val || currPNum != currQNum) return false;
            
            if(currP.left != null){
                pStack.add(currP.left);
                pNumStack.add(currPNum+1);
            }
            
            if(currQ.left != null){
                qStack.add(currQ.left);
                qNumStack.add(currQNum+1);
            }
            
            if(currP.right != null){
                pStack.add(currP.right);
                pNumStack.add(currPNum+1);
            }
            
            if(currQ.right != null){
                qStack.add(currQ.right);
                qNumStack.add(currQNum+1);
            }
        }
        if(!qStack.empty() || !pStack.empty()) return false;
        return true;
    }
}