class Solution {
    public int totalFruit(int[] fruits) {
        int l =0,r=0, n = fruits.length,max=0;
        Map<Integer,Integer> m = new HashMap<>();
        while(r<n)
        {
            m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);
            if(m.size()>2)
            {
                m[a[l]]--;
                if(m[fruits[l]]==0) m.delete(fruits[l]);
                l++;
            }
            max=Math.max(max,l-r+1);
            r++;
        }
        return max;
    }
}