public static int[] sortA1ByA2(int A1[],int N,int A2[], int M)
    {
       TreeMap<Integer,Integer> map=new TreeMap<>();
       
        //storing all the elements of first array in map.
        for( int l=0;l<N;l++)
        if(!map.containsKey(A1[l]))
            map.put(A1[l],1);
        else
            map.put(A1[l],map.get(A1[l])+1);
        
        int i=0;
        
        for( int l=0;l<M;l++)
        {
            //if any element of second array has value more than 0 in map, we
            //store those elements in array and decrement the count in map.
            if(map.containsKey(A2[l]))
            { 
               for( int k=0;k<map.get(A2[l]);k++)
                A1[i++]=(A2[l]);
                map.remove(A2[l]);
            }
        }
        
        //iterating over the map which helps in storing
        //elements in increasing order.
        for(Entry<Integer,Integer> nag : map.entrySet())
        {
            //storing elements whose frequency is more than 0, as many times as
            //their count in output list.
            for(int p=0;p<nag.getValue();p++)
            A1[i++]=nag.getKey();
        }
        
        //returning the output.
        return A1;
    
    }
    
