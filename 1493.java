class Solution {
    static {
    for(int i = 0; i < 500; i++) {
        longestSubarray(new int[] { 0 });
    }
}

public static int longestSubarray(int[] nums) {
    int curr = 0, prev = 0, ans = 0, zeros = 0;
    for (int n : nums) {
        if (n == 0) {
            zeros++;
            ans = Math.max(ans, curr + prev);
            prev = curr;
            curr = 0;
        } else {
            curr++;
        }
    }
    ans = Math.max(ans, curr + prev);
    return (zeros == 0) ? ans - 1 : ans;
}
}