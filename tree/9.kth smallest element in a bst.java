class Solution {
    int count=0;
    int ans =-1;
    public int kthSmallest(TreeNode root, int k) {
         
        in(root,k);
        return ans;
    }
    void in(TreeNode node,int k){
        if(node==null)
            return;
        in(node.left,k);
        count++;
        if(count==k)
        {
            ans = node.val;
            return;
        }
        in(node.right,k);
    }
}
