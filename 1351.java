class Solution {
    public int countNegatives(int[][] grid) {
        int l = 0;
        int r = grid.length-1;
        int n = grid[0].length;
        int c =0;
        while(l<n && r>=0)
        {
            if(grid[r][l]<0)
            {
                c+=n-l;
                r--;
            }
            else 
            {
                l++;
            }
        }
        return c;
    }
}