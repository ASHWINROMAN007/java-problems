import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int num : nums1) {
            s1.add(num);
        }

        Set<Integer> s2 = new HashSet<>();
        for (int num : nums2) {
            s2.add(num);
        }

        
        s1.retainAll(s2);


        int[] result = new int[s1.size()];
        int i = 0;
        for (int num : s1) {
            result[i++] = num;
        }
      return result;
    }
}
