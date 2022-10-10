import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char alpha = scanner.next().charAt(0);

        switch (alpha){

            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println(alpha + " is a Vowel");
                break;

            default:
                System.out.println(alpha + " is a Consonant");

        }

    }

}