import java.math.*;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger c = new BigInteger(a,2);
        BigInteger e = new BigInteger(b,2);
        BigInteger d = c.add(e);
        
        return d.toString(2);
        
    }
}