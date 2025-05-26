class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    public static void comb(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds,int[] arr,int ind,int target)
    {
        if(ind==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
        if(arr[ind]<=target)
        {
            ds.add(arr[ind]);
            comb(ans,ds,arr,ind,target-arr[ind]);
            ds.remove(ds.size()-1);
        }
        comb(ans,ds,arr,ind+1,target);
    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        // add your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        comb(ans,new ArrayList<>(),arr,0,target);
        return ans;
    }
}