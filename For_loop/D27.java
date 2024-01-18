package For_loop;

// in some programing situations we want to take the control to the biging of the loop by passsing , the statments inside the loop which have not been exicuted.
//the keyword continues allow to do this, when continu is encountered inside a loop controlls jumps to the bigning of the loop for performing next itration a continu is usually asociated with an if 
public class D27 {
    public static void main(String[] args) 
    {

        for (int i = 1; i < 4; i++) 
        {
            for(int j=1 ; j<4 ;j++)
            {
                if (i==j)
                {
                    continue;
                }
                System.out.println(i+""+j);

            }

        }

    }
}
