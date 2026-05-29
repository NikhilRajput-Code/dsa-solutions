// ────────────────────────────────────────────────────────────
// Platform  : GFG
// Problem   : LinkedList Traversal | Practice | GeeksforGeeks
// Difficulty: Unknown
// Language  : cpp
// URL       : https://www.geeksforgeeks.org/problems/linkedlist-traversal/1
// Solved    : 2026-05-29T04:37:50.418Z
// ────────────────────────────────────────────────────────────

#include <iostream>using namespace std;​// a linked list nodeclass Node {public:    int data;    Node* next;​    // constructor to initialize a new node with data    Node(int new_data) {        this->data = new_data;        this->next = nullptr;    }};​// function to traverse and print the singly linked listvoid traverseList(Node* head) {    while (head != nullptr) {        cout << head->data;        if (head->next != nullptr)              cout << " -> ";        head = head->next;    }    cout << endl;}​int main() {      // create a hard-coded linked list:    // 10 -> 20 -> 30 -> 40    Node* head = new Node(10);    head->next = new Node(20);    head->next->next = new Node(30);    head->next->next->next = new Node(40);​    traverseList(head);​    return 0;}