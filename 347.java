import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        
        for (int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }


        List<Integer> sortedKeys = new ArrayList<>(h.keySet());
        sortedKeys.sort((a, b) -> h.get(b) - h.get(a));

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < k && i < sortedKeys.size(); i++) {
            l.add(sortedKeys.get(i));
        }

        
        int[] a = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }

        
        if (a.length == 0) {
            return nums;
        }

        return a;
    }
}
