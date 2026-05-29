// ────────────────────────────────────────────────────────────
// Platform  : GFG
// Problem   : Delete Head of Linked List | Practice | GeeksforGeeks
// Difficulty: Unknown
// Language  : cpp
// URL       : https://www.geeksforgeeks.org/problems/delete-head-of-linked-list/1
// Solved    : 2026-05-29T04:48:50.355Z
// ────────────────────────────────────────────────────────────

/*class Node{    int data;    Node next;    Node(int data)    {        this.data = data;        this.next = next;    }}*/class Solution {    public Node deleteHead(Node head) {     if(head == null)     return null;     Node temp = head;     head = head.next;     temp = null;            }}