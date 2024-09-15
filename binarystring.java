class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++)
        {
            char b = s.charAt(i);
            sb.append(b == '0'?'1' : '0');
        }
        int n = Integer.parseInt(sb.toString(),2);
        return  n ;
        
    }
}