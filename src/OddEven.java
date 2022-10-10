import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        String answer = number%2==0 ? "The number " + number + " is Even." : "The number " + number + " is Odd";
        System.out.println(answer);

    }
}
