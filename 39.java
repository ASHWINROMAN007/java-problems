class Solution {
    public void findCombination(int in,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds)
    {
        if(in==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[in]<=target)
        {
            ds.add(arr[in]);
            findCombination(in,arr,target-arr[in],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombination(in+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}