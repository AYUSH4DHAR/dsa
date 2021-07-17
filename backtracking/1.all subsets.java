class Solution {
   public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> each = new ArrayList<>();
    helper(res, each, 0, nums);
    return res;
}
public void helper(List<List<Integer>> res, List<Integer> each, int pos, int[] n) { //no duplicate
    if (pos <= n.length) {
        res.add(each);
    }
    int i = pos;
    while (i < n.length) {
        each.add(n[i]);
        helper(res, new ArrayList<>(each), i + 1, n);
        each.remove(each.size() - 1);
        i++;
        while (i < n.length && n[i] == n[i - 1]) {i++;}
    }
    return;
}
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){  //duplicates allowed
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
****************************************************
 public static void main(String[] args)
    {
        String s = "abcd";
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
    }
 
    private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
 
        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));
 
        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }
