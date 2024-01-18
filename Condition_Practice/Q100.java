package Condition_Practice;

public class Q100 {
    public static void main(String[] args) 
    {

        int a = 2;
        int b = 5;

        if (b<a)
        {
            System.out.println("1");
        }
        if (a==b)
        {
            System.out.println("2");
        }
        if (a>=b)
        {
            System.out.println("3");
        }

        if (a<b)
        {
            System.out.println("4");
           
            if (a==0)
            {
                System.out.println("5");
            }
            else if (a==2)
            {
                System.out.println("6");
            }
            else if (b==5)
            {
                System.out.println("7");
            }
        }

        else if (b>a)
        {
            System.out.println("8");
        }

        if (a!=0)
        {
            System.out.println("9");
        }

        if (b!=0)
        {
            System.out.println("10");
        }
        
    }
    
}
