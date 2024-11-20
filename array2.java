class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<max&&arr[i]>sec)
            {
                sec=arr[i];
            }
        }
        // Code Here
        return (sec==Integer.MIN_VALUE) ? -1 : sec;
    }
}