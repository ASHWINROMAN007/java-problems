import java.util.*;
public class factprime {
    public static boolean prime(int n)
    {
        boolean flag = true;
        if(n<2)
        {
            return false;
        }
        for(int i = 2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }

        else {
            return n*fact(n-1);
        }
    }
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(true)
    {
    System.out.println("Enter the choice 1 for prime : 2 for factorial --- If you want to stop enter 0 ");
    int c = s.nextInt();
    if(c==1)
    {
        System.out.println("Enter a positive integer to check prime or not");
        int n = s.nextInt();
        if(prime(n))
        {
            System.out.println("The integer n : "+n+" is a prime integer");

        }
        else{
            System.out.println("The integer n : "+n+" is not a prime");
        }
    }
    else if(c==2)
    {
        System.out.println("Enter a positive integer to find factorial");
        int n = s.nextInt();
            System.out.println("The factorial of a number "+n+" : "+fact(n));

    }
    else
    {
        System.out.println("Enter valid choice or its okay if you dont want Goodbye!");
        break;
    }
}
}    
}
