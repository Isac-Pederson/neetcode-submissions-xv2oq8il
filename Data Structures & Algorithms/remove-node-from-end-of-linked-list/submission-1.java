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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }


        int count = 1;
        curr = prev;
        while(prev != null){
            if(n == count){
                if(n == 1){
                    prev = prev.next;
                    break;
                }
                prev.next = curr.next;
                curr.next = null;
                break;
            }else{
                curr = curr.next;
                count++;
            }
        }

        curr = prev;
        ListNode res = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = res;
            res = curr;
            curr = temp;
        }


        return res;


    }
}
