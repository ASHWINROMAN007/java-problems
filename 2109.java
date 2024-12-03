class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int sp = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++)
        {
            if(sp<spaces.length &&i==spaces[sp])
            {
                sb.append(" ");
                sp++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}