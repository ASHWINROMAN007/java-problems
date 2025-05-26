// User function Template for Java

class Solution {
    public static void uni(int ind , int[] nums,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++)
        {
            if(i>ind&&nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            uni(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        uni(0,nums,ans,new ArrayList<>());
        return ans;
    }
}