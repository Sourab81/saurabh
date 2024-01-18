package Condition_Practice;

public class Q44 {
    public static void main(String[] args) 
    {
        int a = 72;
        int b = 73;

        if (a<b)
        {
            System.out.println("1");
            
            if (a==0)
            {
                System.out.println("2");

                if (b==0)
                {
                    System.out.println("3");
                    
                    if (a!=0)
                    {
                        System.out.println("4");
                    }
                }
            }

            else if (b==73)
            {
                System.out.println("NO");
            }
            else if (b!=73)
            {
                System.out.println("NO");
            }

        }
        
    }
    
}
