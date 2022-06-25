import java.io.*;
public class Factor
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc v = new Scanner(System.in);

        System.out.println("Input a number: ");
        int n = Integer.parseInt(d.readLine());
        if (n>0)
        {
            while (n%2==0)
            {
                System.out.print(2 + " ");
                n /= 2;
            }

            for (int i = 3; i <= Math.sqrt(n); i+= 2)
            {
                while (n%i == 0)
                {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
            if (n > 2)
                System.out.println(n);
        }
    }
}
