// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Remove Linked List Elements
// Difficulty: Easy
// Language  : java
// URL       : https://leetcode.com/problems/remove-linked-list-elements/
// Solved    : 2026-05-29T05:18:42.511Z
// ────────────────────────────────────────────────────────────

 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         node.val = node.next.val;
    }
         node.next = node.next.next;
}
