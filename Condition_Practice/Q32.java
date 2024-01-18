package Condition_Practice;

public class Q32 
{
    public static void main(String[] args) 
    {
        int a = 23;
        int b = 42;

        if (a<b)
        {
            System.out.println("1");

            if (a==0)
            {
                System.out.println("2");
            }

            else if (a!=0)
            {
                System.out.println("3");
            }
        }
        if (a>b)
        {
            System.out.println("4");

            if (b==0)
            {
                System.out.println("5");
            }

            else if (b!=0)
            {
                System.out.println("6");
            }
        }

        if (a==100)
        {
            System.out.println("7");
        }

        else if (a!=b)
        {
            System.out.println("8");
            if (a!=100)
            {
                System.out.println("9");
            }
            else if (a==100)
            {
                System.out.println("10");
            }
        }

        
    }
    
}
