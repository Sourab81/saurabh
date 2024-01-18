package patterns;
public class D2911 
{
    public static void main(String[] args) {
        int n = 5;
    
           for(int r=1;r<=n;r++)
           {
            for(int c=1; c<=n; c++)
            {
                if((c%2==0 && r!=1 && r!=5) || r==3 || c==3){
                    System.out.print("* ");
    
                }
                else{
                   System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }    
    
}
