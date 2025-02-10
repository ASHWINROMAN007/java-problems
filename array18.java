class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d%n;
        int[] t = new int[d];
        for(int i = 0;i<d;i++)
        {
            t[i]=arr[i];
        }
        for(int i = d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i = n-d;i<n;i++)
        {
            arr[i]=t[i-(n-d)];
        }


        
    }
}