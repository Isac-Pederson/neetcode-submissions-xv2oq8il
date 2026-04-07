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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            int count = 0;
            while(count < 2){
                if(fast == null){
                    return false;
                }
                fast = fast.next;
                count++;
            }

            if(fast == slow){
                return true;
            }
            slow = slow.next;
        }

        return false;


        
    }
}
