//////////////n long n  and n

    public void pairedElements(int arr[], int sum)
    {
        int low = 0;
        int high = arr.length - 1;
 
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println("The pair is : ("
                                   + arr[low] + ", " + arr[high] + ")");
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
        Arrays.sort(arr);
      ///////////////////////////////////////////////////
      n , n
       
       
       static void printPairs(int arr[], int n,
                       int sum)
{
     
    // Store counts of all elements in map m
    HashMap<Integer,
            Integer> mp = new HashMap<Integer,
                                      Integer>();
 
    // Traverse through all elements
    for(int i = 0; i < n; i++)
    {
         
        // Search if a pair can be formed with
        // arr[i].
        int rem = sum - arr[i];
        if (mp.containsKey(rem))
        {
            int count = mp.get(rem);
             
            for(int j = 0; j < count; j++)
                System.out.print("(" + rem +
                                ", " + arr[i] +
                                 ")" + "\n");
        }
        if (mp.containsKey(arr[i]))
        {
            mp.put(arr[i], mp.get(arr[i]) + 1);
        }
        else
        {
            mp.put(arr[i], 1);
        }
    }
}
