/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 82. Remove Duplicates from Sorted List II
 83. Remove Duplicates from Sorted List
 203	Remove Linked List Elements     
 */


class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if((head == NULL) || (head->next == NULL)){
            return head;
        }
        ListNode* p = head;
        ListNode* q = head->next;
        while(q != NULL){
            if(p->val == q->val){
                p->next = q->next;
                q = q->next;
            }
            else{
                p = p->next;
                q = q->next;
            }
        }
       return head;
    }
};
 public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }
