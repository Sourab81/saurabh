package Condition_Practice;

public class Q49 {
    public static void main(String[] args) 
    {
        int a = 7;
        int b = 8;

        if (a>b)
        {
            System.out.println("1");
        }
        if (a>b)
        {
            System.out.println("2");

            if (a!=0)
            {
                System.out.println("3");

                if (a==b)
                {
                    System.out.println("4");

                    if (a!=b)
                    {
                        System.out.println("5");
                    }

                    else if (a!=b)
                    {
                        System.out.println("6");
                    }

                    else if (a==10)
                    {
                        System.out.println("7");
                    }
                }
            }
            else if (a==0)
            {
                System.out.println("8");
            }

            else if (b==0)
            {
                System.out.println("9");
            }

            else if (b!=0)

            {
                System.out.println("10");
            }
        }

    }
    
}
