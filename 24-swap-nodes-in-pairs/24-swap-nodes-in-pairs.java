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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        int amountOfOps = amountOfOperations(head);
        if(amountOfOps < 1) return head;
        
        ListNode dummy = new ListNode(0, head);
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        ListNode head2=secondNode;
        
        for(int i = 0; i < amountOfOps; i++){
            if(secondNode.next == null) firstNode.next = null;
            else firstNode.next = secondNode.next;
            
            secondNode.next = firstNode;
            dummy.next = secondNode;
            
            if(i != amountOfOps -1){
                dummy = firstNode;
                firstNode = firstNode.next;
                secondNode = firstNode.next;
            } 
        }
        return head2;
    }
    
    public int amountOfOperations(ListNode head){
        int i = 1;
        ListNode node = head;
        while(node.next != null){
            i++;
            node = node.next;
        }
        return i/2;
    }
}