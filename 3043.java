class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<String,Integer> h = new HashMap<>();
        for(int num:arr1)
        {
            String s = Integer.toString(num);
            String p = "";
            for(char c : s.toCharArray())
            {
                p=p+c;
                h.put(p,h.getOrDefault(p,0)+1);
            }
        }
        int m =0;
        for(int num:arr2)
        {
            String s = Integer.toString(num);
            String p ="";
            for(char c : s.toCharArray())
            {
                p+=c;
                if(h.containsKey(p))
                {
                    m=Math.max(m,p.length());
                }
            }
        }
        return m;
        
    }
}