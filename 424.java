class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] f = new int[26];
        int maxf =0;
        int l = 0, r = 0, maxl = 0;
        while (r < n) {
            f[s.charAt(r)-'A']++;
            maxf = Math.max(maxf,f[s.charAt(r)-'A']);
            if(r-l+1-maxf>k)
            {
                f[s.charAt(l)-'A']--;
                l++;
            }
            maxl = Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
    }