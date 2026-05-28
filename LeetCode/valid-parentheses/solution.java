// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Valid Parentheses
// Difficulty: Easy
// Language  : java
// URL       : https://leetcode.com/problems/valid-parentheses/submissions/2015697343/
// Solved    : 2026-05-28T17:06:11.331Z
// ────────────────────────────────────────────────────────────

                }
                if (ch == ']' && top != '[') {
                    return false;
                    return false;
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                if (stack.isEmpty()) {
                    return false;
                }
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
