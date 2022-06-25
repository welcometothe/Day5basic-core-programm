import java.io.*;
public class Odd_Even
{
    public static void main(String[] args)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter Number");
        int num = Integer.parseInt(d.readLine());

        if(num%2==0)
        {
            System.out.println("Even Number :-"+num);
        }
        else
        {
            System.out.println("Odd Number :-"+num);
        }

    }

}
