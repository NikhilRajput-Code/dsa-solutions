// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Delete Node in a Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/delete-node-in-a-linked-list/description/
// Solved    : 2026-05-29T05:02:11.618Z
// ────────────────────────────────────────────────────────────

/**
 * Definition for singly-linked list.
 * public class ListNode {
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
