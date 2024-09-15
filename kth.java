class Solution {

    public String kthDistinct(String[] arr, int k) {
        List<String> diss = new ArrayList<>();
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            String current = arr[i];
            boolean isDistinct = true;
            for(int j=0;j<n;j++)
            {
                if(j==i)
                {
                    continue;
                }
                if(arr[j].equals(current))
                {
                    isDistinct = false;
                    break;
                }
            }
        
        if(isDistinct)
        {
        
            diss.add(current);
    }
        }
        if (diss.size() < k){
            return "";
        }
        return diss.get(k-1);
   
    }
}