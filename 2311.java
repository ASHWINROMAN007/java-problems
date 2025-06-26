class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int zero=0;
        for(int i = 0;i<n;i++)
        {
            if(s.charAt(i)=='0') zero++;
        }
        int len = zero;
        long value=0;
        long pow = 1;
        for(int i = n-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                if( value+pow <= k)
                {
                    value+=pow;
                    len++;
                }
            }
            pow*=2;
            if(pow > k) break;
        }
     return len;
    }
}