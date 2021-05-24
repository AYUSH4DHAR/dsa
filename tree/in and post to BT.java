class Solution {
    static  HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
static int index;
    public TreeNode buildTree(int[] in, int[] post) {
       int len = post.length;
        for (int i = 0; i < len; i++)
        mp.put(in[i],  i);
         index = len - 1; // Index in postorder
    return buildUtil(in, post, 0, len - 1 );
    }
    static TreeNode buildUtil(int in[], int post[],
                      int inStrt, int inEnd)
{
   
    // Base case
    if (inStrt > inEnd)
        return null;
 
    /* Pick current node from Postorder traversal 
    using postIndex and decrement postIndex */
    int curr = post[index];
    TreeNode node = new TreeNode(curr);
    (index)--;
 
    /* If this node has no children then return */
    if (inStrt == inEnd)
        return node;
 
    /* Else find the index of this node in Inorder
    traversal */
    int iIndex = mp.get(curr);
 
    /* Using index in Inorder traversal, con
    left and right subtress */
    node.right = buildUtil(in, post, iIndex + 1,
                            inEnd);
    node.left = buildUtil(in, post, inStrt,
                           iIndex - 1);
    return node;
}
}
