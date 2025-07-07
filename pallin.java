class Solution {
    public boolean isPalindrome(int x) {
        int s =0;
        int t=x;
        while(t>0)
        {
            int r = t%10;
            s=s*10+r;
            t=t/10;
            
        }
        if(s==x)
            return true;
        else
            return false;  
    }
}