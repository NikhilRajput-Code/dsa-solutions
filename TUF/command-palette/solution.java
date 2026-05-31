// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/segregate-odd-and-even-nodes-in-ll?subject=dsa&approach=optimal&tab=submissions
// Solved    : 2026-05-31T04:51:11.051Z
// ────────────────────────────────────────────────────────────

       ListNode evenHead = head.next;
       while(even != null && even.next != null) {
        odd.next = odd.next.next;
        even.next = even.next.next;
       ListNode even = head.next;
        odd = odd.next;
        even = even.next;
       }
       odd.next = evenHead;
       ListNode odd = head;
       }
        return head;