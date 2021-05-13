class Solution {
    public int totalFruit(int[] tree) 
    {
        int last_fruit=-1; // the last fruit which we saw
        int second_last_fruit=-1; // the second last fruit which we saw
        int last_fruit_count=0; // the number of last fruits present
        int current_max=0; // current count of the two types of fruits
        int max=0; // the ans returning maximum count
        
        for(int fruit:tree)
        {
		    // if the current fruit is same as last fruit and second last fruit we increment the count
            if(fruit==last_fruit || fruit==second_last_fruit)
            {
                current_max++;
            }
			// if not we just add 1 to the count of last fruit as the second last fruit is removed and a new fruit is added
            else
            {
                current_max=last_fruit_count+1;
            }
            
			// here we check for the last fruit count
            if(fruit==last_fruit)
            {
                last_fruit_count++;
            }
			// if not we settle the count to 1
            else
            {
                last_fruit_count=1;
            }
            
			// if a new fruit is found in the list then we simply chnge second last fruit to last fruit and current fruit to the last fruit
            if(fruit!=last_fruit)
            {
                second_last_fruit=last_fruit;
                last_fruit=fruit;
            }
            max=Math.max(max,current_max);
            
            
        }
        
        
        return max;
        
        
    }
}
