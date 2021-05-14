lass LinkedList
{
    //Function to merge two sorted linked list.
	Node sortedMerge(Node head1, Node head2) 
    { 
      
        //creating a dummy first node to hang the result on.
        Node dummyNode = new Node(0); 
          
        //a pointer, tail is used to store the resultant list after merging.
        Node tail = dummyNode; 
        while(true)  
        { 
            //if either list runs out, we store all the nodes of 
            //other list in link part of tail node.
            if(head1 == null) 
            { 
                tail.next = head2; 
                break; 
            } 
            if(head2 == null) 
            { 
                tail.next = head1; 
                break; 
            } 
            //comparing the data of the two lists and storing the node 
            //with smaller data in link part of the tail node.
            if(head1.data <= head2.data) 
            { 
                tail.next = head1;
                //if data in first list is smaller, we move to 
                //the next node in it.
                head1 = head1.next; 
            }  
            else
            { 
                tail.next = head2; 
                //if data in second list is smaller, we move to 
                //the next node in it.
                head2 = head2.next; 
            } 
              
            //moving to the next node.
            tail = tail.next; 
        } 
        //returning the merged list attached to dummy.
        return dummyNode.next; 
}  
}
