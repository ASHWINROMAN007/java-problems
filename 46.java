class Solution {
    public void fu(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean []b)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =0;i<nums.length;i++)
        {
            if(!b[i])
            {
                b[i]=true;
                ds.add(nums[i]);
                fu(nums,ds,ans,b);
                ds.remove(ds.size()-1);
                b[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean  []b = new boolean[nums.length];
        fu(nums,ds,ans,b);
        return ans;
    }
}