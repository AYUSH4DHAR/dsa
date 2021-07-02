class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        for(int j = nums.length-1; j > i && i>=0;j--){
            if(nums[i]<nums[j]){ 
            swap(nums,i,j);
            break;
            }
        }
        reverse(nums,i+1,nums.length -1);
    }
    private void reverse(int[] nums, int start,int j){
        while(start<j) swap(nums,start++,j--);
    } 
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
