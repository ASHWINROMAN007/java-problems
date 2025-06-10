class Solution {
    public int maxDifference(String s) {
        int[] f = new int[26];
        for(char c : s.toCharArray())
        {
            f[c-'a']++;
        }
        int maxod = Integer.MIN_VALUE;
        int minev = Integer.MAX_VALUE;
        for(int a : f)
        {
            if(a>0)
            {
                if(a%2==1)
                {
                    maxod=Math.max(a,maxod);
                }
                else
                {
                    minev=Math.min(a,minev);
                }
            }
        }
        
        return maxod-minev;
    }
}