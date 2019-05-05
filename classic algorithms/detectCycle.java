 public ListNode detectCycle(ListNode head) {
       
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                {
               ListNode slow2=head;
                while(slow2!=slow){
                   slow2=slow2.next;
                   slow=slow.next;
               }
                return slow2;
            }
        }
        return null;
    }
