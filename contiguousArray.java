import java.util.*;
public class contiguousArray {
    public static int con(int[] arr) {
        int maxlen=0;
        for(int i = 0 ; i<arr.length;i++)
        {
             int c = 0;
            for(int j = i;j<arr.length;j++)
            {
            if(arr[j]==0) c--;
            else c++;
            if(c==0)
            {
                maxlen = Math.max(maxlen,j-i+1);
            }
        }
        }
        return maxlen;
    
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value n");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for(int i = 0 ; i<n;i++)
        {
            arr[i]= s.nextInt();
        }
System.out.println(con(arr));
    }
}
