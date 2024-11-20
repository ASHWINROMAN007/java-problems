import java.util.Arrays;

class Solution {
    int missingNumber(int arr[]) {
        Arrays.sort(arr); 
        int n = arr.length + 1; 
        int expected = 1; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != expected) {
                return expected; 
            }
            expected++; 
        }

        return n; 
    }
}
