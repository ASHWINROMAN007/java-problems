class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int maxDiagonalSq = 0;  
        int maxArea = 0;  
        
        for (int[] a : dimensions) {
            int diagSq = a[0] * a[0] + a[1] * a[1]; 
            int area = a[0] * a[1];
            
            if (diagSq > maxDiagonalSq) {
                maxDiagonalSq = diagSq;
                maxArea = area;
            } else if (diagSq == maxDiagonalSq && area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
