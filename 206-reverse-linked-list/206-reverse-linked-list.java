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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode nextNode = head.next.next, curr = head.next;
        head.next = null;
        
        while(nextNode != null){
            curr.next = head;
            head = curr;
            curr = nextNode;
            nextNode = nextNode.next;
        }
        
        curr.next = head;
        
        return curr;
    }
}