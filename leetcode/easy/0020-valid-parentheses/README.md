# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** C++  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 8.6 MB (beats 93.46%)  
**Submitted:** 2026-11-07T09:19:16.280Z  

```cpp
class Solution {
public:
    bool isValid(string s) {
        stack<char> brackets;

        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                brackets.push(c);
            } else {
                if (brackets.empty()) return false;

                char open = brackets.top();
                brackets.pop();

                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }

        return brackets.empty();
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)