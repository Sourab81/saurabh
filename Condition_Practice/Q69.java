package Condition_Practice;

public class Q69 {
    public static void main(String[] args) 
   {

     int a = 69;
    int b = 56;
    
    if (a>b)
    {
        System.out.println("1");
    }
    if (a!=69)
    {
        System.out.println("2");

    }
    else if (a!=0)
    {
        System.out.println("3");
        
        if (b==56)
        {
            System.out.println("4");

            if (b!=56)
            {
                System.out.println("5");
            }

            else if (a==b)
            {
                System.out.println("6");
            }
        }
    }
    
    if (b!=0)
    {
        System.out.println("7");
    }
    
   }
    
}
