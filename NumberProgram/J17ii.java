package NumberProgram;

import java.util.Scanner;

//  WAP to find sum of n^th whole no.
public class J17ii 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of Whole number:");
        int n = sc.nextInt();
        
        int sum =0 ;

        for (int i=0; i<n ; i++){
            sum=sum +i;
        }
        System.out.println("The sum of n Whole no. is:" + sum);
        
    }
    
}
