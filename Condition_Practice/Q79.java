package Condition_Practice;

public class Q79 {
    public static void main(String[] args) 
    {
        int a = 100;
        int b = 200;

        if (a==b)
        {
            System.out.println("1");

            if (a!=b)
            {
                System.out.println("2");

                if (a==0)
                {
                    System.out.println("3");
                }
            }

            else if (a<b)
            {
                System.out.println("4");
            }

            else if (a>b)
            {
                System.out.println("5");

                if (b==0)
                {
                    System.out.println("6");
                }
            }
        }

        else if (a>b)
        {
            System.out.println("7");
        }

        else if (a==100)
        {
            System.out.println("8");
        }

        if (b==100)
        {

            System.out.println("9");
        }

        if (b==200)
        {

            System.out.println("10");
        }

        
        
    }
    
    
}
