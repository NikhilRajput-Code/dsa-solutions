// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Palindrome Number
// Difficulty: Easy
// Language  : java
// URL       : https://leetcode.com/problems/palindrome-number/
// Solved    : 2026-05-27T19:22:10.407Z
// ────────────────────────────────────────────────────────────

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed || x == reversed / 10);
    }
}

