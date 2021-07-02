
 public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(target-nums[i])){
                int left = tracker.get(target-nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("match not founf");
    }
