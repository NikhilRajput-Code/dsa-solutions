// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Valid Parentheses
// Difficulty: Easy
// Language  : java
// URL       : https://leetcode.com/problems/valid-parentheses/
// Solved    : 2026-05-28T16:56:31.301Z
// ────────────────────────────────────────────────────────────

                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                    return false;
                if (stack.isEmpty()) {
            } else {
                stack.push(ch);
            if (ch == '(' || ch == '[' || ch == '{') {
        for (char ch : s.toCharArray()) {
