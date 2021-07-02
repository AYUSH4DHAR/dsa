
    static int appearsNBy3(int arr[], int n)
    {
        int count1 = 0, count2 = 0;
         
        // take the integers as the maximum
        // value of integer hoping the integer
        // would not be present in the array
        int first =  Integer.MIN_VALUE;;
        int second = Integer.MAX_VALUE;
     
        for (int i = 0; i < n; i++) {
     
            // if this element is previously
            // seen, increment count1.
            if (first == arr[i])
                count1++;
     
            // if this element is previously
            // seen, increment count2.
            else if (second == arr[i])
                count2++;
         
            else if (count1 == 0) {
                count1++;
                first = arr[i];
            }
     
            else if (count2 == 0) {
                count2++;
                second = arr[i];
            }
     
            // if current element is different
            // from both the previously seen
            // variables, decrement both the
            // counts.
            else {
                count1--;
                count2--;
            }
        }
     
        count1 = 0;
        count2 = 0;
     
        // Again traverse the array and
        // find the actual counts.
        for (int i = 0; i < n; i++) {
            if (arr[i] == first)
                count1++;
     
            else if (arr[i] == second)
                count2++;
        }
     
        if (count1 > n / 3)
            return first;
     
        if (count2 > n / 3)
            return second;
     
        return -1;
    }
