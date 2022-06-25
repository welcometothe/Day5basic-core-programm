import java.io.*;
public class Leap {
    public static void main(String[] darsh)throws IOException {
        DataInputStream d = new DataInputStream(System.in);
        int count = 0, year, temp;
        System.out.println("Enter the year");
        year = Integer.parseInt(d.readLine());
        temp = year;

        while (temp != 0)
        {
            temp = temp / 10;
            count++;
        }

        if (count == 4 && year > 0)
        {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println("leap year");
            }

            else
            {
                System.out.println("not leap year");
            }

        } else
        {
            System.out.println("Enter valid year");
        }

    }
}
