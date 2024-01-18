package Condition_Practice;

public class Q38 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        
        if (a<b)
        {
            System.out.println("1");
            
            if (a!=b)
            {
                System.out.println("2");

                if (a>b)
                {
                    System.out.println("3");
                     
                    if (b!=0)
                    {
                        System.out.println("4");
                    }
                }
                else if (a==b)
                {
                    System.out.println("5");
                }
                else if (a!=0)
                {
                    System.out.println("6");

                    if (a!=1)
                    {
                        System.out.println("7");
                        
                        if (a==10)
                        {
                            System.out.println("8");
                        }
                    }
                }

                else if (a==20)
                {
                    System.out.println("9");

                    if (b==20)
                    {
                        System.out.println("9");
                    }
                }
            }
        }
        
    }
    
}
