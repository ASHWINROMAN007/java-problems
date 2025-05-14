class Solution {
    public int findPermutationDifference(String s, String t) {
        int su = 0;
        int i = 0;
        for (char c : s.toCharArray()) {
            su = su + Math.abs(i - (t.indexOf(c)));
            i++;
        }
        return su;
    }
}