class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> c = new HashMap<>();

        // Populate the frequency map
        for (int a : arr) {
            c.put(a, c.getOrDefault(a, 0) + 1);
        }

        // Return the frequency of the target
        return c.getOrDefault(target, 0);
    }
}
