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
    public boolean isPalindrome(ListNode head) {
        List<Integer> myList = new ArrayList<>();
        ListNode node = head;
        //System.out.println("Started");
        while(node != null){
            myList.add(node.val);
            node = node.next;
        }
        //System.out.println("Finshed");
        if(myList.size() == 1) return true;
        int i=myList.size()-1, j=0;
        boolean result = false;
        //System.out.println(myList.size());
        if(myList.size()%2==0){
            while(i>j){
                //System.out.println(myList.get(1));
                if(myList.get(i) != myList.get(j)) break;
                j++;
                i--;
            }
            //System.out.println(i + "," + j);
            if(j == i+1) result = true;
        }else{
            //System.out.println(i + "," + j);
            while(i>j-1){
                //System.out.println(myList.get(i) != myList.get(j));
                if(myList.get(i) != myList.get(j)) break;
                j++;
                i--;
            }
            //System.out.println(i + "," + j);
            if(i == j-2) result = true;
        }
        
        return result;
    }
}