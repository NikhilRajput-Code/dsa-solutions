// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/insertion-at-the-head-of-ll?subject=dsa&approach=optimal-approach&tab=submissions
// Solved    : 2026-05-30T17:33:40.217Z
// ────────────────────────────────────────────────────────────

}
*/

class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        //YOUR CODE GOES HERE
        ListNode newnode = new ListNode(X);
        newnode.next = head;
        head = newnode;
        return head;
    }