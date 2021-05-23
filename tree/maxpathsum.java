class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int m = func(root);
        return res;
    }
    int func(TreeNode root){
        if(root==null)
            return 0;
        int l = func(root.left);
        int r = func(root.right);
        
        int max1 = Math.max(Math.max(l,r)+root.val,root.val);
        int max2 = Math.max(max1,l+r+root.val);
        res = Math.max(res,max2);
        
        
    return max1;
    }
}

