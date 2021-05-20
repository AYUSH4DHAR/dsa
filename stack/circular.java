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
********************************************************
METHOD2
********************************************************
public int canCompleteCircuit(int[] gas, int[] cost) {
    int tank = 0;
    for(int i = 0; i < gas.length; i++)
        tank += gas[i] - cost[i];
    if(tank < 0)
        return - 1;
        
    int start = 0;
    int accumulate = 0;
    for(int i = 0; i < gas.length; i++){
        int curGain = gas[i] - cost[i];
        if(accumulate + curGain < 0){
            start = i + 1;
            accumulate = 0;
        }
        else accumulate += curGain;
    }
    
    return start;
}
