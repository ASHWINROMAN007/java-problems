class Solution {
    public int countQuadruplets(int[] n) {
        int co=0;
        int le = n.length;
        for(int a=0;a<le-3;a++)
        {
          for(int b =a+1;b<le-2;b++)
          {
            for(int c = b+1;c<le-1;c++)
            {
                for(int d = c+1;d<le;d++)
                {
                    if(n[a]+n[b]+n[c]==n[d])
                    {
                        co++;
                    }
                }
            }
          }
        }
        return co;
    }
}