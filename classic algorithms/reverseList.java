public ListNode reverseList(ListNode head) {
        ListNode cur=head,prev=null;
        Deque<Integer> st=new LinkedList<Integer>();
        while(cur!=null){
            st.push(cur.val);
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
        return prev;
    }
