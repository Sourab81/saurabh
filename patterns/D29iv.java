package patterns;
// * * * * * 
// * *   * * 
// *   *   * 
// * *   * * 
// * * * * * 

public class D29iv 
{
    public static void main(String[] args) {

        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n ; c++) {
                if (r == 1 || r == n || c == 1 || c == n || c==r || c+r == n+1) {
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
