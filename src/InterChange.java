import java.util.Scanner;

public class InterChange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After inter-changing value of both number and first number is : " + num1);
        System.out.println("The inter changed value of both number and second number is : " + num2);

    }

}
