// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/deletion-of-the-tail-of-ll?subject=dsa&tab=submissions
// Solved    : 2026-05-28T18:37:06.419Z
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