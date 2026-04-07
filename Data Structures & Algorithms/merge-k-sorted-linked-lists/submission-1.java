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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode();
        ListNode curr = res;

        while(true){
            if(lists == null || lists.length == 0) break;
            int low = Integer.MAX_VALUE; 
            int pos = -1;
            for(int i = 0; i < lists.length; i++){
                if(lists[i] == null){
                    continue;
                }
                if(lists[i].val < low){
                    low = lists[i].val;
                    pos = i;
                }
            }

            if(pos == -1) break;

            curr.next = lists[pos];
            curr = curr.next;
            lists[pos] = lists[pos].next;

        }

        return res.next;



    }
}
