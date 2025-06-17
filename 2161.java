class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }
        // Merge all lists
        List<Integer> result = new ArrayList<>();
        result.addAll(less);
        result.addAll(equal);
        result.addAll(greater);
        int[] r = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            r[i]=result.get(i);
        }
        return r;
    }


}