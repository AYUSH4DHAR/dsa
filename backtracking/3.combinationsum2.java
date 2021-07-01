class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        
        return result;
    }
     private void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
        if(target<0)
            return;
    	else if(target > 0){
    		for(int i = start; i < candidates.length ; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
    			  cur.add(candidates[i]);
    			   getResult(result, cur, candidates, target - candidates[i], i+1);
    			   cur.remove(cur.size() - 1);
    		}
    	}
    	else if(target == 0 ){
    		result.add(new ArrayList<Integer>(cur));
            return;
}
     }
}
