// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Delete the Middle Node of a Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Solved    : 2026-05-30T18:01:40.125Z
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
