package Condition_Practice;

public class Q63 {
    public static void main(String[] args) 
    {
        int a = 72;
        int b = 73;
         
        if (a==0)
        {
            System.out.println("1");
        }

        if (b==0)
        {
            System.out.println("2");
        }
        if (a>=b)
        {
            System.out.println("3");
        }
        else if (a<=b)
        {
            System.out.println("4");
        }

        else if (a!=0)
        {
            System.out.println("5");
        }
        
        if (a==72)
        {
            System.out.println("6");

            if (b==73)
            {
                System.out.println("7");

                if (a==73)
                {
                    System.out.println("8");
                }

                else if (b==72)
                {
                    System.out.println("9");
                }
            }
        }

        else if (a==100)
        {
           
                System.out.println("10");
            
        }
    }
    
}
