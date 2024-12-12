class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if(arr.length==0)
        {
           return "";
        }
        Arrays.sort(arr);
        String f = arr[0];
        String l = arr[arr.length-1];
        int i =0;
        while(i<f.length()&&i<l.length()&&f.charAt(i)==l.charAt(i))
        {
            i++;
        }
        return f.substring(0,i);
    }
}