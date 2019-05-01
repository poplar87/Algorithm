/**
Description
Convert a BST to a sorted circular doubly-linked list in-place. Think of the left and right pointers as synonymous to the previous and next pointers in a doubly-linked list.

Let’s take the following BST as an example, it may help you understand the problem better:

We want to transform this BST into a circular doubly linked list. Each node in a doubly linked list has a predecessor and successor. 
For a circular doubly linked list, the predecessor of the first element is the last element, and the successor of the last element is the first element.

The figure below shows the circular doubly linked list for the BST above. The “head” symbol means the node it points to is the smallest element of the linked list.

Specifically, we want to do the transformation in place. After the transformation, the left pointer of the tree node should point to its predecessor, 
and the right pointer should point to its successor. We should return the pointer to the first element of the linked list.

The figure below shows the transformed BST. The solid line indicates the successor relationship, while the dashed line means the predecessor relationship.

/
Solution
给一棵二叉树，将它转换为双向链表。

There are two steps to solve this problem. We use a dummy node to denote the head of the start of the double linked list. 
Usin a global variable prev to denote the last node we visited. 
Using a helper which recursively in-order traversal the whole tree. Linking prev and cur node together.
After that, link tail node, which is prev and head node which is dummy.right.
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
//Solution
//给一棵二叉树，将它转换为双向链表。

//There are two steps to solve this problem. We use a dummy node to denote the head of the start of the double linked list. 
//Usin a global variable prev to denote the last node we visited. 
//Using a helper which recursively in-order traversal the whole tree. Linking prev and cur node together.
//After that, link tail node, which is prev and head node which is dummy.right.
class Solution {
    Node prev = null;
    public Node treeToDoublyList(Node root) {
        if (root == null){
            return null;
        }
        Node dummy = new Node(0, null, null);
        prev = dummy;
        helper(root);
        //connect tail with head;
        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right;
    }
    
    private void helper(Node cur){
        if (cur == null){
            return;
        }
        helper(cur.left);
        prev.right = cur;
        cur.left = prev;
        prev = cur;
        helper(cur.right);
    }
}
Time Complexity: O(n)
Space Complexity: O(1)
--------------------- 
作者：BigFatSheep 
来源：CSDN 
原文：https://blog.csdn.net/BigFatSheep/article/details/83239067 
版权声明：本文为博主原创文章，转载请附上博文链接！
