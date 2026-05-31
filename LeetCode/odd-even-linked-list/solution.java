// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Odd Even Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/odd-even-linked-list/
// Solved    : 2026-05-31T04:52:50.213Z
// ────────────────────────────────────────────────────────────

 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null) 
    return head;
    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenHead 
    }
