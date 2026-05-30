// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/delete-the-middle-node-in-ll?subject=dsa-concept-revision&tab=editorial&approach=optimal
// Solved    : 2026-05-30T17:40:41.011Z
// ────────────────────────────────────────────────────────────

    return null;
    ListNode slow = head;
    ListNode fast = head.next.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
      slow.next = slow.next.next;
      return head;
     }
}
    if(head == null & head.next == null) 