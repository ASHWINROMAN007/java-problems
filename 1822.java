class Solution {
    public int signFunc(double x)
    {
        if(x>0) return 1;
        else if(x<0) return -1;
        else return 0;
    }
    public int arraySign(int[] nums) {
        double p =1;
        for(int a:nums)
        {
            p*=a;
        }
       return signFunc(p);
    }
}