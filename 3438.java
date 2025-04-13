class Solution {
    public String findValidPair(String s) {
         HashMap<Integer, Integer> h = new HashMap<>();
        for (char a : s.toCharArray()) {
            int b = Character.getNumericValue(a);
            h.put(b, h.getOrDefault(b,0)+1);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char o = s.charAt(i);
            char t = s.charAt(i + 1);
            if (o != t) {
                int a = Character.getNumericValue(o);
                int b = Character.getNumericValue(t);
                if (h.getOrDefault(a, 0) == a && h.getOrDefault(b, 0) == b) {
                    return "" + o + t;
                }
            }
        }
        return "";
    }
}