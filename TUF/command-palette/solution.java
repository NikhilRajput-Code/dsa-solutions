// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/delete-the-middle-node-in-ll?subject=dsa-concept-revision&tab=submissions
// Solved    : 2026-05-30T17:44:57.347Z
// ────────────────────────────────────────────────────────────

    return null;
    ListNode slow = head;
    ListNode fast = head.next.next;
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    if(head == null || head.next == null) 
    public ListNode deleteMiddle(ListNode head) {
class Solution {

 */