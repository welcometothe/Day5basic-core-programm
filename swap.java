import  java.io.*;
public class Swap
{
    public static void main(String[] darsh)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        int num1,num2,temp = 0;


        System.out.println("Enter First Number");
        num1 = Integer.parseInt(d.readLine());
        System.out.println("Enter Second Number");
        num2 =  Integer.parseInt(d.readLine());
        System.out.println(" First Number Is :-"+num1+"Second Number Is :-"+num2+"Before Swaping");

        temp = num1;
        num1 = num2;
        num2 = temp;


        System.out.println(" First Number Is :-"+num1+"Second Number Is :-"+num2+" Afer Swaping");

    }
}

