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
        ListNode res = new ListNode(0, null);
        ListNode curr = res;
        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = 0;
            while(carry != 0){
                sum++;
                carry--;
            }
            sum = l1.val + l2.val;

            carry = Math.floorDiv(sum,10);
            int carrCopy= carry;

            while(carrCopy != 0){
            System.out.println("CARRYCOPY: " + carrCopy);
                sum = sum - 10;
                carrCopy--;
            }

            curr.next = new ListNode(sum, null);
            curr = curr.next;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry, null);
        }

        return res.next;
    }
}
