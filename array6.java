class Solution {
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(int arr[]) {
        int n = arr.length;
        
        if(n<=1)
        {
            return 1;
        }int t=0;
        for(int i =0;i<n;i++)
        {
             t+=arr[i];
        }
        int l=0;
        for(int i =0;i<n;i++)
        {
            int r=t-l-arr[i];
             if(r==l)
             {
                 return i+1;
             }
             l+=arr[i];
        }
        return -1;      // code here
    }
}