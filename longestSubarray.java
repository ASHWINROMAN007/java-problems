import java.util.*;
public class longestSubarray {
    public static int longsub(int[] arr, int k )
    {
        int n = arr.length;
        int m = 0;
        for(int i = 0;i<n;i++)
        {
            int s = 0;
            int c = 0;
            for(int j = i;j<n;j++)
            {
                s+=arr[j];
                c++;
                if(s==k)
                {
                    m = Math.max(m,c);
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k = s.nextInt();
        System.out.println(longsub(arr,k));
        
    }
}
