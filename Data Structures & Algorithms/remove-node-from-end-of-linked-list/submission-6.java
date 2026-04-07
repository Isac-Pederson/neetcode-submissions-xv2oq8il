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
        ListNode prev2 = prev;
        while(prev2 != null){
            if(n == count){
                if(n == 1){
                    prev = prev2.next;
                    break;
                }
                prev2.next = curr.next;
                curr.next = null;
                break;
            }else{
                curr = curr.next;
                count++;
                if(count > 2){
                    prev2 = prev2.next;
                }
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
