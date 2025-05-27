class Solution {
    public static void permu(int ind,int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] bo )
    {
        if(ind==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(!bo[i])
            {
                if(i>0 && nums[i]==nums[i-1] && !bo[i-1]) continue;
                bo[i]=true;
                ds.add(nums[i]);
                permu(ind+1,nums,ans,ds,bo);
                ds.remove(ds.size()-1);
                bo[i]=false;
            }
            
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] bo = new boolean[nums.length];
        permu(0,nums,ans,new ArrayList<>(),bo);
        return ans;
    }
}