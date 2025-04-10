 class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] w = sentence.split(" ");
        int n = w.length;
        for(int i =0;i<n;i++)
        {
            if(w[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;
    }
}
