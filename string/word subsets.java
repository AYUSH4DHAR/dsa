class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] Bfreq = new int[26], check = new int[26];
        int cmax = 0;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < B.length; i++, Arrays.fill(check, 0)) {
            char[] word = B[i].toCharArray();
            for (int j = 0; j < word.length; j++)
                check[word[j] - 'a']++;
            for (int j = 0; j < 26; j++) {
                int diff = check[j] - Bfreq[j];
                if (diff > 0) {
                    cmax += diff;
                    Bfreq[j] += diff;
                }
                if (cmax > 10) return ans;
            }
        }
        for (int i = 0; i < A.length; i++, Arrays.fill(check, 0)) {
            char[] word = A[i].toCharArray();
            int j;
            if (word.length < cmax) continue;
            for (j = 0; j < word.length; j++)
                check[word[j] - 'a']++;
            for (j = 0; j < 26; j++)
                if (check[j] < Bfreq[j]) break;
            if (j == 26) ans.add(A[i]);
        }
        return ans;
    }
}
