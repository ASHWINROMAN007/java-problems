class Solution {
    public void possible(Set<String> se,String b , String c ,int n)
    {
        if(b.length()==n)
        {
            se.add(b);
            return;
        }
        for(int i =0;i<c.length();i++)
        {
            possible(se,b+c.charAt(i),c.substring(0,i)+c.substring(i+1),n);
        }
    }
    public ArrayList<String> findPermutation(String s) {
        // Code here
        int n = s.length();
        Set<String> se = new HashSet<>(); 
        possible(se,"",s,n);
        ArrayList<String> a = new ArrayList<>(se);
        return a;
    }
}