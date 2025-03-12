class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        char[] b = s.toCharArray();

        int c = 0;
        int[] last = new int[3];
        last[0] = -1;
        last[1] = -1;
        last[2] = -1;

        for (int i = 0; i < n; i++) {
            last[b[i] - 'a'] = i;
            if (last[0] != -1 && last[1] != -1 && last[2] != -1) {
                c = c + (1 + Math.min(Math.min(last[0], last[1]), last[2]));
            }
        }
        return c;
    }
}
