public class NNN1 {

    int Age ;
    String Name ;
    String ClgName;
   
    NNN1(int X,String Y, String Z){
        Age = X;
        Name = Y;
        ClgName = Z;
}

    public static void main(String[] args) {
     NNN1  Sonam  = new NNN1(19,"Sonam","BIT");
     NNN1 Sourabh = new NNN1(20,"Sourabh","BIT");

     System.out.println(Sonam.Age);
     System.out.println(Sonam.Name);
     System.out.println(Sonam.ClgName);
     System.out.println("\n");
     System.out.println(Sourabh.Age);
     System.out.println(Sourabh.Name);
     System.out.println(Sourabh.ClgName);
}
    
}
