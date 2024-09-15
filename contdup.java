class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap();
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                return true;
            }
            else{
                map.put(i,false);
            }
                
        }
        return false;
        
    }
}
