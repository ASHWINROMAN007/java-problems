class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1]; // To track visited numbers
        int repeating = -1;
        int missing = -1;

        // Traverse the array and mark visited numbers
        for (int num : arr) {
            if (visited[num]) {
                // If already visited, it's the repeating number
                repeating = num;
            } else {
                visited[num] = true;
            }
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                missing = i;
                break;
            }
        }

        // Prepare result
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating); // Add repeating number
        result.add(missing);  // Add missing number

        return result;
    }
}