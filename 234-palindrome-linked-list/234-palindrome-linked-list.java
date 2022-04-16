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
        if(head==null || head.next ==null) return true;

        ListNode middle = middleNode(head);
        ListNode secondHalf = reverseList(middle);

        while (head != middle){
            if(head.val != secondHalf.val)
                return false;
            head = head.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(fastNode!=null && fastNode.next !=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head!=null){
            ListNode next= head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}