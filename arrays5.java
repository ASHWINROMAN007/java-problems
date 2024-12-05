class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        List<Integer> l = new ArrayList<>();
        for(int i =0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                l.add(arr[i+1]);
            }
        }
        // code here
        return l;
    }
}