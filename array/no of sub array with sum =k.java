class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int num : nums) {
            sum += num;
            if(map.containsKey(sum - k)) {
                count+= map.get(sum-k);
            }
            int x = map.getOrDefault(sum, 0) + 1;
            map.put(sum, x);
        }
        return count;
    }
}
