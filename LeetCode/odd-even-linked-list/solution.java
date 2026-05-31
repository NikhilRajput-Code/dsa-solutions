// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Odd Even Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/odd-even-linked-list/
// Solved    : 2026-05-31T04:54:10.239Z
// ────────────────────────────────────────────────────────────

    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenHead = head.next;
    while(fast != null && fast.next != null) {
        odd.next = odd.next.next;
        even.next = even.next.next;
        odd = odd.next;
        even = even.next;
    }
    }
    odd.next = evenHeadl
}
