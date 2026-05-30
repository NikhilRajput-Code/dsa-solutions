// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/delete-the-middle-node-in-ll?subject=dsa-concept-revision&tab=submissions
// Solved    : 2026-05-30T17:43:11.551Z
// ────────────────────────────────────────────────────────────

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