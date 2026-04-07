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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode();
        ListNode curr = res;
        
        while(l1 != null || l2 != null || carry != 0){
            int v1 = (l1 == null) ? 0 : l1.val;  
            int v2 = (l2 == null) ? 0 : l2.val;  

            int sum = v1 + v2 + carry;
            carry =  Math.floorDiv(sum,10);
            sum = sum % 10;

            curr.next = new ListNode(sum, null);
            curr = curr.next;
            l1 = (l1 == null) ? null : l1.next; 
            l2 = (l2 == null) ? null : l2.next; 
        }

        return res.next;
    }
}
