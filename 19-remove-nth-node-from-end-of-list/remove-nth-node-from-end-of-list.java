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
    // Algo Used: Calculating Len of LL 
    // TC: O N , SC: O 1
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp= head;
        int count= 0;
        while(temp != null){ // cal Len of LL
            temp= temp.next;
            count++;
        }
        temp= head;

        if(count == 1){  // if len if 1 then return null bcz the single node will be deleted
            return null;
        }
        if(count == n){ // if len if n then we have to delete the head, so move head to next posi and return 
            head= head.next;
            return head;
        }

        int size= count - n;  // cal the size which is = size - k 
        for(int i=1; i< size; i++){  // move temp to the size i.e one posi before deleteion node
            temp= temp.next;
        }
            temp.next= temp.next.next;  // delete the node which will be after temp.
        
        return head; // return head
    }
}