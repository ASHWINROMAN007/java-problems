class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        for(int i = 0;i<=n-k;i++)
        {
            char ch = s.charAt(i);
            boolean isv = true;
            for(int j =i;j<i+k;j++)
            {
                if(s.charAt(j)!=ch)
                {
                    isv = false;
                    break;
                }
            }
                if(isv)
                {
                    if(i>0 && s.charAt(i-1)==ch) continue;
                    if(i+k<n && s.charAt(i+k)==ch) continue;

                    return true;
                }
        }
        return false;
    }
}