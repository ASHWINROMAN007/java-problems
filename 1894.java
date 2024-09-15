class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long tot = 0;
        for(int c : chalk)
        {
            tot+=c;
        }
        k=(int) (k%tot);
        for(int i=0;i<chalk.length;i++)
        {
            if(k<chalk[i])
            {
                return i;
            }
            k-=chalk[i];
        }
        return 0;
    }
}