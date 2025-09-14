class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;

        for (int a : nums) {
            m.put(a, m.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
     return -1; 
    }
}
