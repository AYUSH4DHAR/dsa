//using Hashmap to store the prefix sum which has appeared already.
     HashMap<Long, Long>mp=new HashMap<>();
    long sum=0;
    long counter=0;
                 long x = 1;
        //iterating over the array.
        for(int i=0;i<n;i++)
        {
            //storing prefix sum.
            sum+=arr[i];
            
            //if prefix sum is zero that means we get a subarray with sum=0.
            if(sum==0)
            {
                //incrementing the counter.
                counter++;
            }
            
            //if prefix sum is already present in Hashmap then it is repeated 
            //which means there is a subarray whose summation is 0.
            if(mp.containsKey(sum)) 
            {
               //we add the value at prefix sum in Hashmap to counter.
               counter+=mp.get(sum);
            }
            
            //incrementing the count of prefix sum obtained in Hashmap.
            if(mp.containsKey(sum))
            {
                long k=mp.get(sum);
                k++;
                mp.put(sum,k);
                
            }
            else

             mp.put(sum,1L);******************************IMPORANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
       
       //returning the counter.
       return counter ;
    }
