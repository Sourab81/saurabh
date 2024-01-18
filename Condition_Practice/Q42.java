package Condition_Practice;

public class Q42 {
    public static void main(String[] args) 
    {
        int a = 89;
        int b = 98;

        if (a<b)
        {
            System.out.println("1");
            
            if (a>b)
            {
                System.out.println("2");
            }
            else if (a==0)
            {
                System.out.println("3");
            }

            else if (b==0)
            {
                System.out.println("4");
            }
        }

        if (a!=0)
        {
            System.out.println("5");
            
            if (b!=0)

            {
                System.out.println("6");
            }

            else if (a==89)
            {
                System.out.println("7");
            }

            else if (b==98)
            {
                System.out.println("8");
            }
        }
        
    }
    
}
