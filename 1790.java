class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        if (s1.equals(s2))
            return true;

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                counter++;
                sum += s1.charAt(i) * s1.charAt(i) - s2.charAt(i) * s2.charAt(i);
            }
            if (counter > 2)
                return false;
        }

        return sum == 0 && counter == 2;
    }
}