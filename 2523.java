class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i = left;i<=right;i++)
        {
            if(isPrime(i))
            {
                l.add(i);
            }
        }
        if (l.size()<2) return new int[]{-1,-1};
        int min = Integer.MAX_VALUE;
        int a=-1;
        int b =-1;
        for(int i=1;i<l.size();i++)
        {
        int d = l.get(i)-l.get(i-1);
        if(d<min)
        {
            min=d;
            a=l.get(i-1);
            b=l.get(i);
        }
        }
        return new int[]{a,b};
    }
    public static boolean isPrime(int prime)
    {
        if(prime<=1) return false;
        for(int i =2;i<=Math.sqrt(prime);i++)
        {
            if(prime%i==0)
            {
                return false;
            }
        }
        return true;
    }
}