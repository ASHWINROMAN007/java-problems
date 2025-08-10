class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = sign(n);
        for(int i = 0;i<31;i++)
        {
            int p = 1<<i;
            if(sign(p).equals(target))
            {
                return true;
            }
        }
        return false;
        
    }
    public String sign(int n)
    {
        char[] a = String.valueOf(n).toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}