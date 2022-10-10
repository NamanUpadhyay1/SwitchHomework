import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int second = scanner.nextInt();
        System.out.println("Enter the third number : ");
        int third = scanner.nextInt();
        System.out.println("Enter the fourth number : ");
        int fourth = scanner.nextInt();
        System.out.println("Enter the fifth number : ");
        int fifth = scanner.nextInt();

        double total = first+second+third+fourth+fifth;
        double average = total/5;

        System.out.println("Average of these numbers is : " + average);

    }

}
