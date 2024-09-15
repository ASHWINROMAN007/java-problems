class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> check = new HashSet<>();
        for(char p : allowed.toCharArray())
        {
            check.add(p);
        }
        int to = 0;
        for(String word:words)
        {
            boolean l = true;
            for(char c:word.toCharArray())
            {
                if(!check.contains(c))
                {
                    l=false;
                    break;
                }
            }
            if(l)
            {
                to++;
            }
        }
        return to;
        
    }
}