public class NNN24 
{
    int h = 89;// Instance Variable, Because it is ouside the Main Stack
    
    int Sourabh ()
    {



        return 90;
    }



   public static void main(String[] args) 
   {
    
    int f = 89; // Local Variable , because it is inside the stack 
   NNN24 q = new NNN24();
   NNN24.A w = q.new A();
   NNN24.A.B e = w.new B();
   System.out.println(q.h);
   System.out.println(e.b);
    q.Sourabh();
   
   

    } 
      class A 
    {
        
      class B
     {
        int b = 8;

     }
    
    
        
    }

   
    
}
