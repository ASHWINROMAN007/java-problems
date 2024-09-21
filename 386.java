class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> re = new ArrayList<>();
        re.add(1);
        while(re.size()<n)
        {
            int c = re.getLast();
            if(c*10<=n)
            {
                re.add(c*10);
                continue;

            }
            while(c%10==9||c+1>n)
            {
                c/=10;
            }
            re.add(c+1);
        }
      return re;
        
    }
}