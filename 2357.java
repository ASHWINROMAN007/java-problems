class Solution {
    public int minimumOperations(int[] nums) {
      HashSet<Integer> h = new HashSet<>();
      for(int a : nums)
      {
        if(a>0&&!h.contains(a))
        {
            h.add(a);
        }
      }
      return h.size();
    }
}