class Solution {
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            int j =i;
            while(j>0&&arr[j-1]>arr[j])
            {
                int t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;
                j--;
            }
        }
    }
}