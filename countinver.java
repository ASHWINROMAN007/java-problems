class Solution {
    // Function to count inversions in the array.
    static int mergesort(int arr[],int t[],int low,int high)
    {
        if(low>=high) return 0;
        
        int c=0;
        int mid = low+(high-low)/2;
        c+=mergesort(arr,t,low,mid);
        c+=mergesort(arr,t,mid+1,high);
        c+=merge(arr,t,low,mid,high);
        
        return c;
    }
    static int merge(int arr[],int t[],int low,int mid,int high)
    {
        int c =0;
        int k =low;
        int i = low;
        int j = mid+1;
        while(i<=mid&&j<=high)
        {
            if(arr[i]<=arr[j])
            {
                t[k++]=arr[i++];
            }
            else
            
            {
                t[k++]=arr[j++];
                c+=mid-i+1;
            }
        }
        while(i<=mid) t[k++]=arr[i++];
        while(j<=high) t[k++]=arr[j++];
        System.arraycopy(t,low, arr,low,high-low+1);
        return c;
    }
    static int inversionCount(int arr[]) {
        // Your Code Herein
        int j = arr.length;
        int[] t = new int[j];
        return mergesort(arr,t,0,j-1);
    }
}