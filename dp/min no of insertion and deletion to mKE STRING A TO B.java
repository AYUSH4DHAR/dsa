static void printMinDelAndInsert(String str1,
                                     String str2)
    {
        int m = str1.length();
        int n = str2.length();
 
        int len = lcs(str1, str2, m, n);
 
        System.out.println("Minimum number of "
                           + "deletions = ");
        System.out.println(m - len);
 
        System.out.println("Minimum number of "
                           + "insertions = ");
        System.out.println(n - len);
    }
