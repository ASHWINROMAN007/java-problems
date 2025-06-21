class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxieco(answerKey, k, 'T'), maxieco(answerKey, k, 'F'));
    }

    public int maxieco(String s, int k, char ch) {
        int l = 0, r = 0, maxle = 0, fli = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            if (c != ch) fli++;
            while (fli > k) {
                if (s.charAt(l) != ch) fli--;
                l++;
            }
            if (fli <= k) {
                maxle = Math.max(maxle, r - l + 1);
            }
            r++;
        }
        return maxle;
    }
}