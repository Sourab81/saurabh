package Condition_Practice;

public class Q28 
{
    public static void main(String[] args) 
    {
        int a = 20;
        int b = 30;

        if (a<=0)
        {
            System.out.println("a is less then 1");

            if (b<=0)
            {
                System.out.println("b is also less then 1");
            }
        }
        if (a==0)
        {
            System.out.println("a is neutral");

            if (b==0)
            {
                System.out.println("b is also neutral");
            }
        }
         if (a!=0)
        {
            System.out.println("a is not 0");

            if (b!=0)
            {
                System.out.println("b is also not 0");
            }
        }
        else if (a<b)
        {
            System.out.println("a is smaller then b");
            
            if (a>b)
            {
                System.out.println("a is greater then b");
            }
        }

       

    
       
        
    }
    
}
