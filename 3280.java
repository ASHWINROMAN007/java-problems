class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder b = new StringBuilder() ;
        for(int i = 0;i<3;i++)
        {
            int temp = Integer.parseInt(arr[i]);
            b.append(Integer.toBinaryString(temp));
            if(i<2)
            {
                b.append("-");
            }
        }
        return b.toString();
    }
}