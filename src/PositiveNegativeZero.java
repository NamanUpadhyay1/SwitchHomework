import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if (num==0)
        {

            System.out.println("The number " + num + " is Zero.");

        }
        else if (num<0)
        {

            System.out.println("The number " + num + " is a Negative number.");

        }
        else if (num>0)
        {

            System.out.println("The number " + num + " is a Positive number.");

        }

    }

}
