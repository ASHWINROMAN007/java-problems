class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] re = new int[n];
        if (k == 0) {
            return re;

        } else if (k > 0) {
            for (int i = 0; i < n; i++) {
                int c = 0;
                int s = 0;
                while (c != k) {
                    s = s + code[(i + 1 + c) % n];
                    c++;
                }
                re[i] = s;
            }
        }
        if (k<0) {
            for (int i = 0; i < n; i++) {
                int c = 0;
                int s = 0;
                while (c != Math.abs(k)) {
                    s = s + code[(i - 1 - c + n)%n];
                    c++;
                }
                re[i] = s;
            }
        }
        return re;

    }
}