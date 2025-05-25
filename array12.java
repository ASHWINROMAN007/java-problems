class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
         int n = arr.length;
        int l = arr[0];
        int sl = -1;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>l)
            {
                sl=l;
                l=arr[i];
            }
            else if(arr[i]<l&&arr[i]>sl)
            {
                sl=arr[i];
            }
        }
        return sl;
    }
}