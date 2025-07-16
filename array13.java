class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int n = arr.length;
        int m = arr[0];
        int sm = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<m)
            {
                sm=m;
                m=arr[i];
            }
            else if(arr[i]!=m&&arr[i]<sm)
            {
                sm=arr[i];
            }
        }
        if(sm==Integer.MAX_VALUE)
        {
            return new int[]{-1,-1};
        }
        return new int[]{m,sm};
    }
}