class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] w = sentence.split(" ");
        
        if (w.length == 1 && sentence.charAt(0) == sentence.charAt(sentence.length() - 1)) {
            return true;
        }
        
        if (w.length == 1 && sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }
        
        for (int i = 0; i < w.length; i++) {
            String currentWord = w[i];
            String nextWord = w[(i + 1) % w.length];
            
            if (currentWord.charAt(currentWord.length() - 1) != nextWord.charAt(0)) {
                return false;
            }
        }
        
        return true;
    }
}
