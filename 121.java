class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mi = Integer.MAX_VALUE;
        int ma = 0;
        for(int i =0;i<n;i++)
        {
               mi=Math.min(mi,prices[i]);
               ma=Math.max(ma,prices[i]-mi);
        }
        return ma;
    }
}