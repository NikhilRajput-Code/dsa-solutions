// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Delete Node in a Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/delete-node-in-a-linked-list/
// Solved    : 2026-05-29T05:16:27.499Z
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
