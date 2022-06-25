import java.io.*;
public class Vowel_Const
{
    public static void main(String[] darsh)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter alphabet To check");
        String alphabet = d.readLine();
        switch(alphabet)
        {
            case "a":
                System.out.println(alphabet   + ":-is vowel");
                break;
            case "e":
                System.out.println(alphabet   + ":-is vowel");
                break;
            case "i":
                System.out.println(alphabet   + ":-is vowel");
                break;
            case "o":
                System.out.println(alphabet   + " :-is vowel");
                break;
            case "u":
                System.out.println(alphabet   + ":-is vowel");
                break;

            default:
                System.out.println(alphabet   +  ":-isconstants");
        }
    }
}

