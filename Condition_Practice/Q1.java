package Condition_Practice;

public class Q1 
{
   
    public static void main(String[] args) 
    {
        int a=10;
        int b = 20;

        if (a<b)
        {
            System.out.println("This is first");

        }
        if (a>b)
        {
            System.out.println("This is second");

        }
        

        else if (b!=0)
        {
            System.out.println("This is tenth");
        }

        if (a<b)
        {
            System.out.println("This is eleventh");
            if (a>b)
            {
                System.out.println("This is twelth");
                if (a!=0)
                {
                    System.out.println("This is Thirteenth");
                }
                else if (a>b)
                {
                    System.out.println("This is Fourteenth");
                }

            }

        }
        if (a>b)
        {
            System.out.println("This is fifteenth");
        }
        else if (a==10)
        {
            System.out.println("This is 16th");
            if (b==20)
            {
                System.out.println("This is 17th");
            }

        }
        else if (a>b)
        {
            System.out.println("This is 18th");
        }
        else if (a<b)
        {
            System.out.println("This is 19th");

            if (b!=100)
            {
                System.out.println("This is 20th");
            }
        }
        
    }
    
}
    
