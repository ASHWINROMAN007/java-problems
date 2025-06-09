class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> sub = new ArrayList<>();
        int sum =0;
        int n = arr.length;
        int l =0;
        int r;
        for(r =0;r<n;r++)
        {
            sum+=arr[r];
            while(sum>target&&l<r)
            {
                sum=sum-arr[l];
                l++;
            }
            if(sum==target)
            {
                sub.add(l+1);
                sub.add(r+1);
                return sub;
            }
        }
        sub.add(-1);
        return sub;
    }
}