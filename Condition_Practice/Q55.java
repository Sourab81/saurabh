package Condition_Practice;

public class Q55 {
    public static void main(String[] args) 
    {
        int a = 69;
        int b = 96;

        if (a>b)

        {
            System.out.println("1");

            if (a<b)
            {
                System.out.println("2");
            }
        }
        
        else if (a<b)
        {
            System.out.println("3");

        }

        else if (a==10)
        {
            System.out.println("4");
        }

        if (a==69)
        {
            System.out.println("5");

            if (a>b)
            {
                System.out.println("8");
            }
        }
        if (b==96)
        {
            System.out.println("6");
        }

        if (a!=69)
        {
            System.out.println("7");
        }
        else if (a==100)
        {
            System.out.println("9");
        }

        else if (b==100)
        {
            System.out.println("10");
        }
    }
    
}
