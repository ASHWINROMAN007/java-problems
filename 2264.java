class Solution {
    public String largestGoodInteger(String num) {
        String maxGood ="";
      for(int i=0;i<=num.length()-3;i++)
      {
        String ec = num.substring(i,i+3);
        if(ec.charAt(0)==ec.charAt(1)&&ec.charAt(1)==ec.charAt(2))
        {
             if (maxGood.isEmpty() || ec.compareTo(maxGood) > 0) {
                    maxGood = ec;
                }
        }
      }
      return maxGood;  
    }
}