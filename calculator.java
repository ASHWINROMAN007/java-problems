import java.io.*;
import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class calculator
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int a = s.nextInt();
        System.out.println("Enter a number 2:");
        int b = s.nextInt();
         System.out.println("Choose an operation: +  -  *  /");
        char c = s.next().charAt(0);
        int result = 0;
        switch(c)
        {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                if(b!=0)
                {
                result = a/b;
                }
                else{
                    System.out.println("Error : Division by Zero");
                }
                break;
            default :
                System.out.println("Enter correct operator");
                break;
        }
        System.out.println("The result you need : "+result);
        s.close();
    }
}
