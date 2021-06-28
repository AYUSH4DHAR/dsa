   public static int res=0;
	public int longestConsecutive(Node root){
		if(root==null)
			return 0;
		res=0;
		longestConsecutiveutil(root,0,root.data);
		if(res==1)
    		return -1;
		return res;
	}
	public static void longestConsecutiveutil(Node root,int curLength,int expected){
		if(root==null)
			return;
		if(root.data==expected){
			curLength++;
		}
		else{
			curLength=1;
		}
		res=Math.max(res,curLength);
		longestConsecutiveutil(root.left,curLength,root.data+1);
		longestConsecutiveutil(root.right,curLength,root.data+1);
	}
    
