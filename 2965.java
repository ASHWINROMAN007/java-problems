class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean [] visited = new boolean[1+grid.length*grid[0].length];
        int[] r = new int[2];
        for(int [] ro:grid)
        {
            for(int v:ro)
            {
                if(visited[v])
                {
                    r[0]=v;
                }
                visited[v]=true;
            }
        }
        for(int i =1;i<visited.length;i++)
        {
            if(!visited[i])
            {
                r[1]=i;
                return r;

            }
        }
        return r;
    }
}