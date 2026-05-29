// ────────────────────────────────────────────────────────────
// Platform  : GFG
// Problem   : LinkedList Traversal | Practice | GeeksforGeeks
// Difficulty: Unknown
// Language  : cpp
// URL       : https://www.geeksforgeeks.org/problems/linkedlist-traversal/1
// Solved    : 2026-05-29T04:36:00.377Z
// ────────────────────────────────────────────────────────────

/*class Node {    int data;    Node next;    Node(int val) {        data = val;        next = null;    }}*/class Solution {    void printList(Node head) {        List<Integer> val = new ArrayList<>();        Node temp = head;        while(temp != null) {            val.add(temp.data);            temp = temp.next;        }        return val;    }}