package Condition_Practice;

public class Q14 
{
    public static void main(String[] args) 
    {   
        int a = 50;
        int b = 60;

        if (a==b)
        {
            System.out.println("1");

            if (a!=b)

            System.out.println("2");

            else if (a!=0)
            {
                System.out.println("3");
            }
            else if (a==0)
            {
                System.out.println("4");
            }
            else if (a==50)
            {
                System.out.println("5");

                if (b==60)
                {
                    System.out.println("6");
                }
                else if (b>a)
                {
                    System.out.println();
                }
            }
        }
        
    }
    
}
