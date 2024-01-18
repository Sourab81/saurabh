package Num_Patterns;
//         1 
//       2 2 2 
//     3 3 3 3 3 
//   4 4 4 4 4 4 4 
// 5 5 5 5 5 5 5 5 5
public class J5_2 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for (int r=1,p=1; r<=n ; r++,p++){     
            
            for(int c=r ; c<n ; c++)
            {

                System.out.print("  ");
            }

            for(int c=1 ; c<=r ; c++)
            {
                System.out.print(p+" ");
            }

            for(int c=1 ; c<r ; c++)
            {
                System.out.print(p+" ");
            }



            System.out.println();
        }
    }
    
}
