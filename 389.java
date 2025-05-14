class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        for (char c : s.toCharArray()) {
            sumS = sumS ^ c;
        }
        for (char c : t.toCharArray()) {
            sumS = sumS ^ c;
        }
        return (char)(sumS);
    }
}
