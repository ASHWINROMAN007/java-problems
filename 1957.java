class Solution {
    public String makeFancyString(String s) {
        int n= s.length();
        if(n<=2)
        {
            return s;
        }
        StringBuilder b = new StringBuilder();
        b.append(s.charAt(0));
        b.append(s.charAt(1));
        for(int i=2;i<n;i++)
        {
            if(b.charAt(b.length()-1)!=s.charAt(i)||b.charAt(b.length()-2)!=s.charAt(i))
            {
                b.append(s.charAt(i));
            }
        }
        return b.toString();
    }
}