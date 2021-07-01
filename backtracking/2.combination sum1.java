public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        
        return result;
    }
    
    private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
    	if(target<0)
            return;
        else if(target == 0 ){
    		result.add(new ArrayList<Integer>(cur));
            return;
    	}
        else if(target > 0){
    		for(int i = start; i < candidates.length && target >= candidates[i]; i++){
    			cur.add(candidates[i]);
    			getResult(result, cur, candidates, target - candidates[i], i);
    			cur.remove(cur.size() - 1);
    		}
    	
    	}
    }
}
****************************
class Solution {
    int n;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
           n = candidates.length;
           List<List<Integer>> result = new ArrayList<List<Integer>>();
          helper(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }
void helper(List<List<Integer>> res, List<Integer> cur, int arr[], int target, int i){
        if(i>=n)
            return;
        if(target<0)
             return;
        if(target==0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
         cur.add(arr[i]);  
         if(target - arr[i]>=0){
            
            helper(res,cur,arr,target-arr[i],i);
         }
    
         i++;
         while(i<n && arr[i]==arr[i-1])i++;
         cur.remove(cur.size()-1);
         helper(res,cur,arr,target,i);
    
    return;
}
}
