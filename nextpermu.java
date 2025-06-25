class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int ind=-1;
        for(int i = n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind!=-1){
        for(int i = n-1;i>ind;i--)
        {
            if(arr[i]>arr[ind])
            {
                swap(arr,i,ind);
                break;
            }
        }
        }
        rev(arr,ind+1,n-1);
    }
    void swap(int[] arr,int i , int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t ;
    }
    void rev(int[] arr,int i,int n)
    {
        while(i<n)
        {
            swap(arr,i,n);
            i++;
            n--;
        }
    }
}