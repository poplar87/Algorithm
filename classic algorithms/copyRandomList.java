public Node copyRandomList(Node head) {
       Node ite=head,next;
        //first round  make copy of each node ,link them together side by side in a single list
        while(ite!=null){
            next=ite.next;
            Node copy=new Node();
            copy.val=ite.val;
            copy.next=next;
            ite.next=copy;
            ite=next;
        }
        ite=head;
        //second round  assign pointers to copy nodes
        while(ite!=null){
            if(ite.random!=null){
                ite.next.random=ite.random.next;
            }
            ite=ite.next.next;
        }
         //third round restore original list,extract the copy nodes
        ite=head;
        Node pesdoHead=new Node();
        pesdoHead.val=0;
        Node copyIte=pesdoHead,copy;
        while(ite!=null){
           next= ite.next.next;
            //extract copy nodes
           copy=ite.next;
            copyIte.next=copy;
            copyIte=copy;
            //restore original nodes
            ite.next=next;
            ite=next;
        }
        return pesdoHead.next;
    }
