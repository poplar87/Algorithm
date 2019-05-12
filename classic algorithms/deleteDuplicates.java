  public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head,prev=dummy;
        while(cur!=null){
            while(cur.next!=null &&cur.next.val==cur.val)
            {
             cur=cur.next;
            }
             if (prev.next == cur) { 
                
            prev = prev.next;// cur is distinct, val maybe the same,two objects' val are equal  not means two objects are equal,move pre to next node
        } else {
                 
            prev.next = cur.next;// skip duplicates, but pre shouldn't move now
        }
            
            cur=cur.next;
           
        }
        return dummy.next;
    }
