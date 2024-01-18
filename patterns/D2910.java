package patterns;
//  * 
//  * * 
//  * * * 
//  * * * * 
//  * * * * * 

public class D2910 
{
    public static void main(String[] args) {

        int n = 5;
        for (int r = 1; r <=n; r++) 
        {
            for(int c = r ; c<=r ; c++)
            {
                System.out.print(" ");
            }
            for(int c = 1 ; c<=r ; c++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }
    
}
