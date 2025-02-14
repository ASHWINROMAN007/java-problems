class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int res=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long i:nums)
            pq.add(i);
        while(pq.peek()<k)
        {
            pq.add((2*pq.poll())+pq.poll());
            res++;
        }
        return res;
    }
}