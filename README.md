# Fibonacci-using-Dynamic-Programming
Dynamic Programming is a technique optimal for solve overlapping sub-problem. But until recursion, which usually solves sub-problem many times, dynamic programming solves a sub-problem only once, and record the result for future use.

Dynamic Programming is much faster than recursive method. Recursive is bottom up method, whereas Dynamic memory allocation technique is top down process.

- Time complexity for recursive: F(n) = O(2<sup>n</sup>), as every problem is divided in two sub-problems, most are overlapping which are solved again and again.
- Time complexity for Dynamic technique : F(n) = O(n), as there are sub-problems, and every sub-problem is solved only once.
