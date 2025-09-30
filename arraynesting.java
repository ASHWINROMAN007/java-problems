import java.util.*;
public class arraynesting {
    public static int nest(int in , int[] arr ,boolean[]vis)
    {
        int c = 0;
        while(!vis[in])
        {
        vis[in]=true;
        in = arr[in];
        c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter value");
        for(int i = 0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        boolean[] vis = new boolean[n];
        int max=0;
        for(int i = 0;i<n;i++)
        {
            if(!vis[i])
            {
                max = Math.max(max,nest(i, arr,vis));
            }
        }
     System.out.println(max);
    }
}
