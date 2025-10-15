class Solution {
    static final int MOD = 1000000007; // Define the modulus value

    long maxValue(int arr[]) {
        int n = arr.length;
        long sum = 0;

        // Sort the arrays
        Arrays.sort(arr);

        // Calculate the weighted sum using modular arithmetic
        for (int i = 0; i < n; i++) {
            sum = (sum + ((long) arr[i] * i) % MOD) % MOD;
        }

        return sum;
    }
}