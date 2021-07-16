ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // count number of distinct elements for first window of size k
        for (int i = 0; i < k; i++)
        {
            if (hm.containsKey(A[i]))
                hm.put(A[i], hm.get(A[i]) + 1);
            else
                hm.put(A[i], 1);
        }
        result.add(hm.size());

        // calculate answer for rest of the windows
        for (int i = k; i < n; i++)
        {
            // if frequency of last element of the window is greater than 1
            // then decrease the frequency
            if (hm.get(A[i - k]) > 1)
            {
                hm.put(A[i - k], hm.get(A[i - k]) - 1);
                // insert new element into the window
                if (hm.containsKey(A[i]))
                    hm.put(A[i], hm.get(A[i]) + 1);
                else
                    hm.put(A[i], 1);
            } 
            else
            {
                // remove last element from window
                hm.remove(A[i - k]);
                // insert new element into the window
                if (hm.containsKey(A[i]))
                    hm.put(A[i], hm.get(A[i]) + 1);
                else
                    hm.put(A[i], 1);
            }

            result.add(hm.size());
        }
        return result;
    }
}
