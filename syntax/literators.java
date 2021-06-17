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
***********************************************
import java.util.Arrays;
import java.util.Iterator;

public class ArrayToIterable {
   public static void main(String args[]){
      Integer[] myArray = {897, 56, 78, 90, 12, 123, 75};
      Iterator<Integer> iterator = Arrays.stream(myArray).iterator();
      while(iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
