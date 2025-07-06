class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int a : arr)
        {
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int l =-1;
        for(int key : m.keySet())
        {
            if(key==m.get(key))
            {
                l=key;
            }
        }
        return l;
    }
}