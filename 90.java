class Solution {
    public void fu(int ind , int[] nums,List<Integer> ds ,List<List<Integer>> li )
    {
        li.add(new ArrayList<>(ds));
        for(int i = ind;i<nums.length;i++)
        {
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            fu(i+1,nums,ds,li);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        fu(0,nums,new ArrayList<>(),li);
        return li;
    }
}