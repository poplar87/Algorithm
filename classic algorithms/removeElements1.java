 public ListNode removeElements(ListNode head, int val) {
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode curr=head,prev=dum;
        while(curr!=null){
            if(curr.val==val)
            {  
           prev.next=curr.next;
            }
            else 
                prev=curr;
            curr=curr.next;
        }
        return dum.next;
    }
