class Solution {
    public int possibleStringCount(String word) {
        int size = word.length();
        int ans = 1;
        for(int i=1; i<size; i++){
            if(word.charAt(i-1)==word.charAt(i)){
                ans++;
            }
        }
        return ans;
    }
}