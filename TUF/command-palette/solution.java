// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/deletion-of-the-head-of-ll?subject=dsa&tab=submissions
// Solved    : 2026-05-28T18:42:22.488Z
// ────────────────────────────────────────────────────────────

        this.next = next;
    }
}
*/
class Solution {
    public ListNode deleteHead(ListNode head) {
        if(head == null) 
        return null;
        ListNode temp = head;
        head = head.next;
        temp = null;
        return head;
    }
}