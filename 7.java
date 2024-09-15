class Solution {
    public int reverse(int x) {
        boolean al = true;
        if(x<0)
        {
            al = false;
        }
        x=Math.abs(x);
        long re = 0;
        while(x>0){
            re = re*10+x%10;
            x=x/10;
            if(re>Integer.MAX_VALUE || re<Integer.MIN_VALUE)
                 return 0;
        }
        if(!al)
        {
            return -1*(int)re;
        }
        return (int)re;
    }
}