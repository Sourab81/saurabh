package NumberProgram;

import java.util.Scanner;

public class J17 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of natural number:");
        int n = sc.nextInt();
        
        int sum =0 ;

        for (int i=1; i<=n ; i++){
            sum=sum +i;
        }
        System.out.println("The sum of n natural no. is:" + sum);

        
    }
    
}
