  public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
       int balance=0;
        int start=0;
        int i=0;
        int ob=0;
        while(i<n){
            balance +=   gas[i]-cost[i];
            if(balance <0)
            {
                ob+=balance;
                start=i+1;
                balance = 0;
            }
            i++;
        }
        if(balance + ob >=0)
            return start;
        else
           return -1;
    }
