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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode p = list3;
        
        if(list1 == null && list2 == null) return list3.next;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                p.next = list1;
                list1 = list1.next;
            }else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        
        while(list1 != null){
            p.next = list1;
            list1 = list1.next;
            p = p.next;
        }
        
        
        while(list2 != null){
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }
        
        return list3.next;
    }
}