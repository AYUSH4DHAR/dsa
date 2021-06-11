Iterator itr = list.iterator();*  ****************

ListIterator i = list.listIterator();******************
  
        System.out.println("ListIterator:");
        System.out.println("Forward Traversal : ");
  
        while (i.hasNext())
            System.out.print(i.next() + " ");
  
     
  
        System.out.println("Backward Traversal : ");
  
        while (i.hasPrevious())
            System.out.print(i.previous() + " ");
  
         l.set(80000);
 ****************************
   Iterator
   Can traverse elements present in Collection only in the forward direction.	
   
   	ListIterator
   Can traverse elements present in Collection both in forward and backward directions.
