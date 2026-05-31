// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Odd Even Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/odd-even-linked-list/
// Solved    : 2026-05-31T04:54:40.463Z
// ────────────────────────────────────────────────────────────

    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenHead = head.next;
    while(even != null && even.next != null) {
        odd.next = odd.next.next;
        even.next = even.next.next;
        odd = odd.next;
        even = even.next;
    }
    odd.next = evenHead;
    return head;
    if(head == null || head.next == null) 
