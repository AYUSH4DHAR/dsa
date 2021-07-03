class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        // boolean o =false;
        // boolean t = false;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i))
            {
                // o = pal(s,i+1,n-1-i);
                // t = pal(s,i,n-2-i);
                return pal(s,i+1,n-1-i)||pal(s,i,n-2-i);
            }
        }
        return true;
    }
    boolean pal(String s,int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                 return false;
            i++;
            j--;
        }
        return true;
    }
}
