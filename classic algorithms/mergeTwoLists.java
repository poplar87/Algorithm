public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<l2.val){
            ListNode ll1=l1.next;
            l1.next=mergeTwoLists(ll1,l2);
            return l1;
        }
        else{
            ListNode ll2=l2.next;
            l2.next=mergeTwoLists(l1,ll2);
            return l2;
        }
    }
