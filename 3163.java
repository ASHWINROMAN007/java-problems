class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        for(int i =0;i<n;i++)
        {
            char c = word.charAt(i);
            int cou =1;
            while(i<n-1 && word.charAt(i+1)==c&&cou<9)
            {
                cou++;
                i++;
            }
            sb.append(cou).append(c);
        }



        return sb.toString();
        
    }
}