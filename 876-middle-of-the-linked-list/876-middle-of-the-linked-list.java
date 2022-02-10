/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int lp = 1, rp = 1, mp = Integer.MIN_VALUE;
        ListNode firstNodeThrough = head, finalNode = head;
        while(firstNodeThrough.next != null){
            rp++;
            firstNodeThrough = firstNodeThrough.next;   
        }

        if(lp == rp) return head;
        
        //if(rp%2 == 0) 
        mp = (int)(rp/2)+1;
        //else mp = (int)(rp/2);
        
        while(lp<mp){
            finalNode = finalNode.next;
            lp++;
        }
        
        return finalNode;
    }
}