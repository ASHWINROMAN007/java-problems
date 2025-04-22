class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high)
        {
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }


    static int partition(int arr[], int low, int high) {
        // your code here
        int pi = arr[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while((arr[i]<=pi)&&(i<high))
            {
                i++;
            }
            while((arr[j]>pi)&&(j>low))
            {
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    static int swap(int[] arr , int i , int j)
    {
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        return 0;
    }
}