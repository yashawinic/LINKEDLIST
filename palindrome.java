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
class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        //Finding middle node [slow]
        while( fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse second half
        ListNode prev = null;
        while(slow!=null)
        {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        //palindrome
        ListNode left = head;
        ListNode right = prev;
        while(right!=null)
        {
            if(left.val!=right.val)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
