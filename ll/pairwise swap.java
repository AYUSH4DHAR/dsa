lass Solution {
    public Node pairwiseSwap(Node head)
    {
        Node a=head, b=null, c=null;
        Node prev=null;
        
        while( a!=null && a.next!=null )
        {
            b = a.next;     // b is second node
            c = b.next;     // c is third node (c might be null)
                            // current order : prev - a - b - c
            
            if(a == head)
                // b will be new head
                head = b;
            else
                // else, linking second node i.e. b, to a's ancestor
                prev.next = b;
            
            b.next = a;     // a should now come after b
            a.next = c;     // connecting a to list ahead
            
            // now we have to update a and prev for next pair
            prev = a;
            a = c;
        }
        
        return head;
    }
}

****************
    public ListNode swapPairs(ListNode head) {
       
          ListNode cn = head;
          ListNode b=null, c=null;
          if(cn==null || cn.next==null)
             return cn;
           if(cn.next!=null){
         
             b = cn.next;
             c = b.next;
             b.next = cn;
             cn.next = swapPairs(c);
        }
        
        return b;
    }
