import java.io.DataInputStream;
import java.io.IOException;

public class flipcoin1
{
    public static void main(String[] darsh)throws IOException {
        int num;
        float PercentHead=0,PercentTail=0,Headcount=0,Tailcount=0;

        {
            DataInputStream d = new DataInputStream(System.in);

            System.out.println("Enter The Number Of Times To Flip Coin");
            num = Integer.parseInt(d.readLine());

            if(num > 0)
            {
                for(int i=0;i<num;i++) {
                    double Coin = Math.floor((Math.random()*10)%2);
                    System.out.println(Coin);
                    if(Coin<0.5)
                    {
                        Headcount++;
                    }else {
                        Tailcount++;
                    }
                }
                PercentHead = (Headcount/num)*100;
                PercentTail = (Tailcount/num)*100;
                System.out.println("Percentage of head "+PercentHead);
                System.out.println("Percentage of tail "+PercentTail);
            }
            else{

                System.out.println("Enter positive number only");
            }
        }

    }
}
