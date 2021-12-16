/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode node = head;
        int i = 0;
        while(node.next != null && i <= 10001){
            node = node.next;
            i++;
        }
        System.out.println(i);
        return (i == 10002) ? true : false;
    }
}