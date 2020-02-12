/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /**
     * 双指针
     *
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            // 记录下一个节点，并将当前节点的下一个节点赋为 prev
            ListNode nextTemp = curr.next;
            curr.next = prev;
            // prev curr 都向前移一位
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}