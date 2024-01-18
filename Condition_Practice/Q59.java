package Condition_Practice;

public class Q59 {
    public static void main(String[] args) 
    {
        int a = 84;
        int b = 94;

        if (a==b)
        {
            System.out.println("1");

            if (b==0)
            {
                System.out.println("2");

                if (a==0)
                {
                    System.out.println("3");
                }
            }

            else if (a==84)
            {
                System.out.println("4");

                if (b==94)
                {
                    System.out.println("5");

                    if (a<b)
                    {
                        System.out.println("6");

                        if (a!=0)
                        {
                            System.out.println("7");
                        }
                    }
                }
            }

            if (b!=0)
            {
                System.out.println("8");
            }

            else if (a<=0)
            {
                System.out.println("9");
            }
            if (b>0)
            {
                System.out.println("10");
            }
        }
        
    }
    
}
