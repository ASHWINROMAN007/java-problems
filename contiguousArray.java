import java.util.*;
public class contiguousArray {
    public static int con(int[] arr) {
        int c = 0;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                --c;
            }
            else 
            {
                ++c;
            }
            if(c==0)
            {
                return i+1;
            }
        }
        return c;
    
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
