public class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;          
        long maxDiff = 0;      
        long result = 0;       
        for (int num : nums) {
            result = Math.max(result, maxDiff * num);
            maxDiff = Math.max(maxDiff, max - num);
            max = Math.max(max, num);
        }

        return result;          
    }
}
