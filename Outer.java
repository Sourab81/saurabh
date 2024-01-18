public class Outer
{
    int x = 10  ;
    
    class k
    {
        int v = 90;
    
    }

    public static void main(String[] args) 
    {
       Outer j = new Outer();
       System.out.println(j.x);
       Outer.k h = j.new k();
       System.out.println(h.v);
    }    
}
