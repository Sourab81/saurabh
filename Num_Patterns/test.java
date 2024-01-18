package Num_Patterns;

public class test 
{
    public static void main(String[] args) 
    {
    
        int n = 5;
        for(int i = 1 ; i<=n; i++)
        {
            for(int c =i; c<=n-1;c++)
            {
                System.out.print("  ");
            }
            for(int c=1;c<=i;c++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
  
}
