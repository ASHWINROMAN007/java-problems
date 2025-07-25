class Solution {
    static int characterReplacement(String s, int k) {
        // codinte here
        int n = s.length();
        int[] m = new int[26];
        int l = 0;
        int r=  0;
        int max = 0;
        int maxf=0;
        while(r<n)
        {
            m[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,m[s.charAt(r)-'A']);
            if((r-l+1)-maxf>k)
            {
               m[s.charAt(l)-'A']--;
               l++;
            }
            if((r-l+1)-maxf<=k)
            {
                max=Math.max(max,r-l+1);
            }
            r++;
            
        }
        return max;
            
    }
}
