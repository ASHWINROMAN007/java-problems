class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> ban = new HashSet<>();
        for(int num : banned)
        {
            ban.add(num);
        }
        int c=0;
        for(int i =1;i<=n;i++)
        {
            if(ban.contains(i)) continue;
            if(maxSum-i <0) return c;
            maxSum-=i;
            c++;
        }
        return c;
    }
}