class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        int i;
        for(i =0;i<details.length;i++)
        {
            int age = Integer.parseInt(details[i].substring(11,13));
            if(age>60)
            {
                res++;
            }
        }
        return res;
        
    }
}