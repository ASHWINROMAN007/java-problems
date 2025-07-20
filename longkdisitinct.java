import java.util.*;

class Solution {
    public int longestKSubstr(String s, int k) {
        int l = 0, r = 0;
        int n = s.length();
        int max = -1;
        Map<Character, Integer> h = new HashMap<>();

        while (r < n) {
            char c = s.charAt(r);
            h.put(c, h.getOrDefault(c, 0) + 1);

            while (h.size() > k) {
                char leftChar = s.charAt(l);
                h.put(leftChar, h.get(leftChar) - 1);
                if (h.get(leftChar) == 0) {
                    h.remove(leftChar);
                }
                l++;
            }

            if (h.size() == k) {
                max = Math.max(max, r - l + 1);
            }

            r++;
        }

        return max;
    }
}
