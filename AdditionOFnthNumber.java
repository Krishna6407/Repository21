import java.util.Scanner;
public class AdditionOFnthNumber{
    public static void main(String[] args)
       {
         System.out.println("Enter a number");
         Scanner sc = new Scanner(System.in);
         int sum=0;
         int b= sc.nextInt();
         for(int i=1; i<=b; i++)
         {
           sum = sum+i;
         }
         System.out.println("Addition of "+b+" is "+sum);
        }
    }