package Num_Patterns;
// 1 
// 2 2
// 3 3 3
// 4 4 4 4
public class J5_3 
{
    public static void main(String[] args) 
    {
        int n = 4;
        for(int r=1,p=1; r<=n ; r++,p++)
        {

            for(int c=1; c<=r; c++)
            {
               System.out.print(p+" ");
            }



            System.out.println();
        }
       
        
    }

    
}
