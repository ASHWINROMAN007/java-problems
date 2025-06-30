class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int max = 0;
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (int key : m.keySet()) {
            if (m.containsKey(key + 1)) {
                int len = m.get(key) + m.get(key + 1);
                max = Math.max(max, len);

            }
        }
        return max;
    }
}