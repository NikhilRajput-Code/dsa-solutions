// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Remove bad elements in Linked List
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/contest/linked-list/remove-bad-elements-in-linked-list?tab=submissions
// Solved    : 2026-05-28T18:43:11.427Z
// ────────────────────────────────────────────────────────────

        }

        ListNode curr = head;

        // Traverse the list
        while (curr != null && curr.next != null) {
            
            // If next node has target value, remove it
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } 
            else {
                curr = curr.next;
            }
        }

        return head;
    }
}