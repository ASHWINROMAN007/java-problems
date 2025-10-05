class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        int steps = arr[0];
        int maxran = arr[0];
        int jump = 1;
        if (arr[0] == 0)
                return -1;
        
       for(int i = 1; i<n ;i++)
       {
            if (i == n - 1)
                return jump;
            maxran = Math.max(maxran,i+arr[i]);
            steps--;
            if(steps == 0)
            {
                jump++;
                if(i>=maxran)
                {
                    return -1;
                }
                steps = maxran-i;
            }
        }
        return -1;
    }
}