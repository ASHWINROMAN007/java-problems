class Solution {
    public long maxKelements(int[] nums, int k) {
         PriorityQueue<Integer>pq = new PriorityQueue<>((a, b)->Integer.compare(b,a));
         for(int n : nums)
         {
            pq.add(n);
         }
         long sum = 0;
         while(k-- > 0)
         {
            int n = pq.poll();
            sum+=n;
            pq.add((int)(Math.ceil((double)n/3)));
         }
         return sum;
        
    }
}