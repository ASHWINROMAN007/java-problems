class Solution {
    public int maxAbsoluteSum(int[] nums) {  
         int sum = 0, negSum = 0, max = 0;
        for(int i : nums) 
        {
            sum = Math.max(0, sum + i);  
            negSum = Math.min(0, negSum + i);  
            max = Math.max(max , Math.max(sum, Math.abs(negSum)));
        }
        return max;
        
    }
}