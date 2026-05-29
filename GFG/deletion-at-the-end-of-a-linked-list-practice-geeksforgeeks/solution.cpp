// ────────────────────────────────────────────────────────────
// Platform  : GFG
// Problem   : Deletion at the end of a Linked List | Practice | GeeksforGeeks
// Difficulty: Unknown
// Language  : cpp
// URL       : https://www.geeksforgeeks.org/problems/deletion-at-the-end-of-a-linked-list/1
// Solved    : 2026-05-29T04:53:15.096Z
// ────────────────────────────────────────────────────────────

/*class Node{    int data;    Node next;    Node(int data)    {        this.data = data;        this.next = next;    }}*/class Solution {    public Node removeLastNode(Node head) {      if(head==null || head.next == null) {        return null;      }        Node temp = head;        while(temp.next.next != null) {            temp = temp.next;        }        temp.next = null;        return head;    }}