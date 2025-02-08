class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        int s =n/2;
        for(int j : h.keySet())
        {
            if(h.get(j)>s)
            {
                return j;
            }
        }
        return -1;
    }
}