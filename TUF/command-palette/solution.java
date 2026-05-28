// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/deletion-of-the-head-of-ll?category=linked-list&subcategory=fundamentals-single-ll&tab=submissions
// Solved    : 2026-05-28T18:24:41.445Z
// ────────────────────────────────────────────────────────────

        this.next = next;
    }
}
*/
class Solution {
    public ListNode deleteHead(ListNode head) {
        ListNode temp = head;
        head = head.next;
        temp = null;
        if(head == null) 
        return null;
        return head;
    }
}