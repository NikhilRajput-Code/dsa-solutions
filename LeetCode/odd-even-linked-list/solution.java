// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Odd Even Linked List
// Difficulty: Medium
// Language  : java
// URL       : https://leetcode.com/problems/odd-even-linked-list/
// Solved    : 2026-05-31T04:53:40.072Z
// ────────────────────────────────────────────────────────────

class Solution {
    public ListNode oddEvenList(ListNode head) {
    if(head == null || head.next == null) 
    return head;
    ListNode odd = head;
    ListNode even = head.next;
    ListNode evenHead = head.next;
    while(fast != null && fast.next != null) {
        odd.next = odd.next.next;
        even.next = even.next.next;
        o
    }
