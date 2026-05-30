// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Delete the Middle Node of a Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Solved    : 2026-05-30T18:00:40.126Z
// ────────────────────────────────────────────────────────────

 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) 
        return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
