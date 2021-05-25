 int largestBst(Node root)
    {
        if (root==null)
         return 0;
        if(isBST(root)){
            return size(root);
            
        }
        int left = largestBst(root.left);
        int right = largestBst(root.right);
        return Math.max(left,right);
        
        
    }
     boolean isBST(Node root)
        {
          ArrayList<Integer> al = new ArrayList<Integer>();
          inorder(root,al);
          int n = al.size();
          for(int i=0;i<n-1;i++){
              if(al.get(i)>=al.get(i+1))
              return false;
          }
          return true;
          
        }
        void inorder(Node root,ArrayList<Integer> al){
            if(root==null)
            return ;
        inorder(root.left,al);
        al.add(root.data);
        inorder(root.right,al);
        
        }
        int size(Node root){
            if(root==null)
            return 0;
            return 1+size(root.left)+size(root.right);
        }
