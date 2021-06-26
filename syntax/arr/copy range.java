copyOfRange(int[] original, int from, int to)
  
  
  int arr[] = { 12, 13, 14, 15, 16, 17, 18 };
  
        // to index is within the range
        int[] copy = Arrays.copyOfRange(arr, 2, 6);
        for (int i : copy)
            System.out.print(i + "  ");
  
        System.out.println();
        // to index is out of range
        // It assigns Zero to all the index out of range
        int[] copy1 = Arrays.copyOfRange(arr, 4, arr.length + 3);
