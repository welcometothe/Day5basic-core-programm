import java.io.*;
public class Largest
{
    public static void main(String[] darsh)throws IOException
    {
        Scanner sc v = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter First Number");
        num1 = Integer.parseInt(d.readLine());

        System.out.println("Enter Second Number");
        num2 = Integer.parseInt(d.readLine());

        System.out.println("Enter Third Number");
        num3 = Integer.parseInt(d.readLine());

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Larger Number Is :-" + num1);
        } else if (num2 > num1 && num2 > num3)
        {
            System.out.println("Larger Number Is :-" + num2);

        }else
        {
            System.out.println("Larger Number Is :-" + num3);
        }

    }
}

