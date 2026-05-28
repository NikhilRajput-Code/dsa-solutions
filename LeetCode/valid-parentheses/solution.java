// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Valid Parentheses
// Difficulty: Easy
// Language  : java
// URL       : https://leetcode.com/problems/valid-parentheses/description/
// Solved    : 2026-05-28T16:58:10.282Z
// ────────────────────────────────────────────────────────────

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
