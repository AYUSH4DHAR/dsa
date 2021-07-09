 int isSumTree(Node node)
    {
        int ls; // for sum of nodes in left subtree
        int rs; // for sum of nodes in right subtree
  
        /* If node is NULL or it's a leaf node then
         return true */
        if (node == null || isLeaf(node) == 1)
            return 1;
  
        if (isSumTree(node.left) != 0 && isSumTree(node.right) != 0)
        {
            // Get the sum of nodes in left subtree
            if (node.left == null)
                ls = 0;
            else if (isLeaf(node.left) != 0)
                ls = node.left.data;
            else
                ls = 2 * (node.left.data);
  
            // Get the sum of nodes in right subtree
            if (node.right == null)
                rs = 0;
            else if (isLeaf(node.right) != 0)
                rs = node.right.data;
            else
                rs = 2 * (node.right.data);
              
            /* If root's data is equal to sum of nodes in left
               and right subtrees then return 1 else return 0*/
            if ((node.data == rs + ls))
                return 1;
            else
                return 0;
        }
  
        return 0;
    }
  



 static int isSumTree(Node node)
    {
        int ls,rs;
       
        // If node is NULL or it's a leaf
        // node then return true
        if(node == null || (node.left == null && node.right == null))
        {
            return 1;
        }
       
        // Get sum of nodes in left and
        // right subtrees
        ls = sum(node.left);
        rs = sum(node.right);
       
        // If the node and both of its
        // children satisfy the property
        // return 1 else 0
        if((node.data == ls + rs) && isSumTree(node.left) != 0 && isSumTree(node.right) != 0)
        {
            return 1;
        }
        return 0;
    }
