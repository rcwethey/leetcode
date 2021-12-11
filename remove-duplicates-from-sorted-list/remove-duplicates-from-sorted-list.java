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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if(p == null) return head;
        ListNode future = p.next;
        
        while(future != null){
            System.out.println("P: " + p.val + ", F: " + future.val);
            if(future.val == p.val){
                future = future.next;
            }else{
                p.next = future;
                future = future.next;
                p = p.next;
            }
            p.next = future;
        }
        return head;
    }
}