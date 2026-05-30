// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/add-two-numbers-in-ll?subject=dsa&approach=optimal-approach&tab=submissions
// Solved    : 2026-05-30T18:36:31.274Z
// ────────────────────────────────────────────────────────────

        ListNode temp = dummy;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        int carry = 0;
        while((l1 != null || l2 != null) || carry != 0 ) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }