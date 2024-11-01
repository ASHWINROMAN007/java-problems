class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int n = result.length();
            
            // Check if the last two characters are the same as the current character
            if (n >= 2 && result.charAt(n - 1) == current && result.charAt(n - 2) == current) {
                continue; // Skip adding the current character to avoid three consecutive identical characters
            }
            
            result.append(current);
        }
        
        return result.toString();
    }
        
    
}