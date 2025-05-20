class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int n = arr.length;
        for(int i = 0;i<=n-2;i++)
        {
             int min = i;
            for(int j = i ;j<=n-1;j++)
            {
             if(arr[j]<arr[min]) min=j;
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
        return arr[k-1];
    }
}