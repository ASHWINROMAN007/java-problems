import java.util.*;

public class larg {
    public static void main(String[] args) {
        int[] result = ar();
        System.out.println("Target found at indices: " + Arrays.toString(result));
    }
public static int findfirst(int[]arr,int t)
{
        int left = 0;
        int right = arr.length - 1;
        int result =-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) {
                result = mid;
                right = mid-1;
            } else if (arr[mid]<t) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return result;
}
public static int findlast(int[]arr,int t)
{
 int left = 0;
        int right = arr.length - 1;
        int result =-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) {
                result = mid;
                left = mid+1;
            } else if (arr[mid]<t) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return result;
}
    public static int[] ar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter frequency:");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the target:");
        int t = s.nextInt();

        int left = 0;
        int right = n - 1;
        int[] re = new int[] {-1,-1};
        re[0]=findfirst(arr,t);
        re[1]=findlast(arr,t);

        return re;
    }
}
