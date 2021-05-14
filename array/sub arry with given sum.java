//   int first = 0;
//         int last = 0;

//         long result = m[first];
//         ArrayList<Integer> res = new ArrayList<Integer>();
//         while (result != s) {
//             if (result > s) {
//                 if (first == last) {
//                     last++;
//                     first++;
//                     if (last >= n) break;
//                     result = m[first];
//                 } else {
//                     result -= m[first];
//                     first++;
//                 }
//             } else {
//                 last++;
//                 if (last < n) {
//                     result += m[last];
//                 } else {
//                     break;
//                 }
//             }
//         }

//         if (result != s) {
//             res.add(-1);
//         } else {
//             res.add(first + 1);
//             res.add(last + 1);
            
//         }
//         return res;    
//     }
 int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;
 
        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
 
            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                    "Sum found between indexes " + start
                    + " and " + p);
                return 1;
            }
 
            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
 
        System.out.println("No subarray found");
        return 0;
    }
