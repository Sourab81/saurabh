package Condition_Practice;

public class Q31 
{
    public static void main(String[] args) 
    {
        int a = 20;
        int b = 30;

        if (a>=b)
        {
            System.out.println("1");
        }
        else if (a<=b)
        {
            System.out.println("2");

            if (a==b)
            {
                System.out.println("3");
            }
            else if (a>b)
            {
                System.out.println("4");


            }
            else if (a<b)
            {
                System.out.println("5");
            }
        }
        if (a==0)
        {
            System.out.println("6");

            if (b==0)
            {
                System.out.println("7");
            }
            else if (a!=0)
            {
                System.out.println("8");
            }
            else if (b!=0)
            {
                System.out.println("9");
            }

            if (b==0)
            {
                System.out.println("10");
            }
        }

        
    }
    
}
