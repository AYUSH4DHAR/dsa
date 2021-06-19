public static void FirstKelements(int arr[],
                                  int size,
                                  int k)
{
     
    // Creating Min Heap for given
    // array with only k elements
    // Create min heap with priority queue
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int i = 0; i < k; i++)
    {
        minHeap.add(arr[i]);
    }
     
    // Loop For each element in array
    // after the kth element
    for(int i = k; i < size; i++)
    {
         
        // If current element is smaller
        // than minimum ((top element of
        // the minHeap) element, do nothing
        // and continue to next element
        if (minHeap.peek() > arr[i])
            continue;
         
        // Otherwise Change minimum element
        // (top element of the minHeap) to
        // current element by polling out
        // the top element of the minHeap
        else
        {
            minHeap.poll();
            minHeap.add(arr[i]);
        }
    }
     
    // Now min heap contains k maximum
    // elements, Iterate and print
    Iterator iterator = minHeap.iterator();
     
    while (iterator.hasNext())
    {
        System.out.print(iterator.next() + " ");
    }
}

 O(log(k) + (n-k)*log(k) 
   
   
   ************/////////////****************
   ***********************************
   
   
   quicksort
   
   
   
   


