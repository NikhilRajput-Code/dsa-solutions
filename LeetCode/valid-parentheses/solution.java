// ────────────────────────────────────────────────────────────
// Platform  : LeetCode
// Problem   : Valid Parentheses
// Difficulty: Easy
// Language  : java
// URL       : https://leetcode.com/problems/valid-parentheses/
// Solved    : 2026-05-28T17:06:20.281Z
// ────────────────────────────────────────────────────────────

                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
                    return false;
