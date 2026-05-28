// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/deletion-of-the-tail-of-ll?category=linked-list&subcategory=fundamentals-single-ll&tab=submissions
// Solved    : 2026-05-28T18:33:20.116Z
// ────────────────────────────────────────────────────────────

class Solution {
    public ListNode deleteTail(ListNode head) {
        //your code goes here
        if(head == null || head.next == null) {
            return null;
        }
        ListNode temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}