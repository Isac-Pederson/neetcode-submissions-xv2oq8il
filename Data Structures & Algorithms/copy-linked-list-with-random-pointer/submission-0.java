/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node hcurr = head;
        Node dummy = new Node(0);
        Node current = dummy;
        ArrayList<Node> list = new ArrayList<>();



        while(hcurr != null){
            current.next = new Node(hcurr.val);
            list.add(current.next);
            current = current.next;
            hcurr = hcurr.next;
        }
        current = dummy;
        hcurr = head;


        while(hcurr!= null){
            current = current.next;
                if(hcurr.random == null){
                    current.random = null;
                }else{
                    for(Node node : list){
                        if(hcurr.random.val == node.val){
                            current.random = node;
                        }
                    }
                }
            hcurr = hcurr.next;
        }

        return dummy.next;
        
        
    }
}
