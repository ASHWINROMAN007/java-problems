import java.util.*;
public class contiguousArray {
    public static int con(int[] arr) {
        int[] co = new int[2*arr.length+1];
        int c=0;
        int maxlen=0;
        for(int i = 0;i<co.length;i++)
        {
            co[i]=-2;
        }
        int of = arr.length;
        co[of]=-1;
        for(int j = 0;j<arr.length;j++)
            {
            if(arr[j]==0) c--;
            else c++;
            int in = c+of;
            if(co[in]!=-2)
            {
                maxlen = Math.max(maxlen,j-(co[in]));
            }
            else{
                co[in]=j;
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
