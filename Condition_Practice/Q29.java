package Condition_Practice;

public class Q29 
{
    public static void main(String[] args) 
    {
        int a = 45;
        int b = 25;

        if (a<b)
        {
            System.out.println("1");
            
            if (a>b)
            {
                System.out.println("2");

                if (a==0)
                {
                    System.out.println("3");

                    if (b==0)
                    {
                        System.out.println("4");

                        if (a!=0)
                        {
                            System.out.println("5");
                            if (a!=0)
                            {
                                System.out.println("6");
                            }
                        }
                    }
                }
            }
        }
        else if (a<=b)
        {
           System.out.println("7");
        }
        else if (b<=a)
        {
            System.out.println("8");

            if (a>=0)
            {
                System.out.println("9");

                if (b!=0)
                {
                    System.out.println("10");
                }
            }

        }
        
    }
    
}
