 void detectAndRemoveLoop(Node node)
    {
 
        // If list is empty or has only one node
        // without loop
        if (node == null || node.next == null)
            return;
 
        Node slow = node, fast = node;
 
        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;
 
        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;
 
            slow = slow.next;
            fast = fast.next.next;
        }
 
  *********************************************************************************************************************
   find the size of loop , put slow at head and fst at k nodes ahead of slow and start the while loop in aS SHOWN BELOW
  *********************************************************************************************************************
        /* If loop exists */
        if (slow == fast) {
            slow = node;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
 
            /* since fast->next is the looping point */
            fast.next = null; /* remove loop */
        }
    }
