import java.util.Scanner;

public class AddSubDivMul {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        double first = scanner.nextInt();
        System.out.println("Enter your second number : ");
        double second = scanner.nextInt();
        System.out.println("Enter one of the symbol between + - / * ");
        String symbol = scanner.next();

        double add = first+second;
        double sub = first-second;
        double div = first/second;
        double mul = first*second;

        switch (symbol){

            case "+":
                System.out.println("The Addition of " + first + " and " + second + " is : " + add);
                break;
            case "-":
                System.out.println("The Subtraction of " + first + " and " + second + " is : " + sub);
                break;
            case "/":
                System.out.println("The Division of " + first + " and " + second + " is : " + div);
                break;
            case "*":
                System.out.println("The Multiplication of " + first + " and " + second + " is : " + mul);
                break;

            default:
                System.out.println("Please Enter one of the symbols between + - / *");

        }

    }

}


