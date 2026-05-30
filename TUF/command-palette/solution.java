// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/delete-the-middle-node-in-ll?subject=dsa&approach=optimal-approach&tab=submissions
// Solved    : 2026-05-30T18:03:51.330Z
// ────────────────────────────────────────────────────────────

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
      slow.next = slow.next.next; // skip
      return head;
     }
} 