class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int nu : nums)
        {
            if(nu<=a)
            {
                a=nu;
            }
            else if(nu<=b)
            {
                b=nu;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}