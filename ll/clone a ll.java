 Node curr = start, temp = null;
 
    // insert additional node after
    // every node of original list
    while (curr != null)
    {
        temp = curr.next;
 
        // Inserting node
        curr.next = new Node(curr.data);
        curr.next.next = temp;
        curr = temp;
    }
    curr = start;
 
    // adjust the random pointers of the
    // newly added nodes
    while (curr != null)
    {
        if(curr.next != null)
            curr.next.random = (curr.random != null)
                      ? curr.random.next : curr.random;
 
        // move to the next newly added node by
        // skipping an original node
        curr = (curr.next != null) ? curr.next.next
                                        : curr.next;
    }
 
    Node original = start, copy = start.next;
 
    // save the start of copied linked list
    temp = copy;
 
    // now separate the original list and copied list
    while (original != null && copy != null)
    {
        original.next = (original.next != null)?
                    original.next.next : original.next;
 
        copy.next = (copy.next != null) ? copy.next.next
                                            : copy.next;
        original = original.next;
        copy = copy.next;
    }
    return temp;
}
 
