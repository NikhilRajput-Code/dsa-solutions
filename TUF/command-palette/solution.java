// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/traversal-in-linked-list?subject=dsa&tab=editorial
// Solved    : 2026-05-28T18:18:03.055Z
// ────────────────────────────────────────────────────────────

*/

class Solution {
    public List<Integer> LLTraversal(ListNode head) {
        //your code goes here
        List<Integer> ans = new ArrayList<>();
        while(temp != null) {
            ans.add(temp.data);
            temp = temp.next;
        }
        return ans;
    }
        ListNode temp = head;
}