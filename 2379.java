class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] a = blocks.toCharArray();
        int n = blocks.length();
        int min = Integer.MAX_VALUE;
        for(int i =0;i<=n-k;i++)
        {
            int c=0;
            for(int j =i;j<i+k;j++)
            {
                if(a[j]=='W')
                {
                    c++;
                }
            }
            min=Math.min(min,c);
        }
        return min;
    }
}