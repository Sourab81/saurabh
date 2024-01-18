package Condition_Practice;

public class Q90 {
    public static void main(String[] args) 
    {
        int a = 53;
        int b = 35;

        if (a<=b)
        {
            System.out.println("1");

            if (a>=b)
            {
                System.out.println("2");
            }

            else if (a==0)
            {

                System.out.println("2");
            }

            else if (a!=0)
            {
                System.out.println("4");
            }

            if (b<=0)

            {

                System.out.println("5");
            }
            if (b==0)
            {
                System.out.println("6");

                if (b!=0)
                {
                    System.out.println("7");
                }
                else if (a!=0)
                {

                    System.out.println("8");

                    if (a==53)

                    {

                        System.out.println("9");
                    }
                }
            }
        }

        else if (a>=b)
        {
            System.out.println(10);
        }
        
    }
    
}
