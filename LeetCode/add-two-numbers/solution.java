// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Add Two Numbers
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/add-two-numbers/
// Solved    : 2026-05-30T18:37:00.577Z
// ────────────────────────────────────────────────────────────

*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        while((l1 != null || l2 != null) || carry != 0 ) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.data;
