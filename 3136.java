class Solution {
    public boolean isVovel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')||(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public boolean isValid(String word) {
         if (word.length() < 3)   return false;
        boolean v = false;
        boolean c = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isLetter(ch)) {
                if (isVovel(ch)) {
                    v = true;
                } else {
                    c = true;
                }
            } 

            if (v && c) {
                continue;
            }
        }
        return v && c;
    }
}