import  java.io.*;
public class Compute
{
    public static void main(String[] darsh)throws IOException
    {
        Scanner sc v = new Scanner(System.in);

        int dividend , divisor;
        System.out.println("Enter dividend");
        dividend = Integer.parseInt(d.readLine());
        System.out.println("Enter divisor");
        divisor =  Integer.parseInt(d.readLine());

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
