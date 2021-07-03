// . License Key Formatting
class Solution {
    public String licenseKeyFormatting(String S, int K) {
//        s = s.toUpperCase();
//        s = s.replaceAll("-","");
        
//        StringBuilder sb = new StringBuilder(s);
//            for(int i=s.length()-k;i>0;i-=k)
//            {
//                sb.insert(i,"-");
//            }
//         return sb.toString();
          StringBuilder sb = new StringBuilder();

        for (int i = S.length() - 1, count = 0 ; i >= 0 ; --i) {
            
            char c = S.charAt(i);
            if (c == '-') continue;

            // put a '-' first if we already append K characters
            if (count == K) {
                sb.append('-');
                count = 0;
            }

            sb.append(Character.toUpperCase(c));
            ++count;
        }

        return sb.reverse().toString();
    }
}
