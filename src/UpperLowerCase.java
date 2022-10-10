import java.util.Scanner;

public class UpperLowerCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an Alphabet an UpperCase Alphabet : ");
        Character alpha = scanner.nextLine().charAt(0);
        char lowerCase = alpha.toLowerCase(alpha);

        if (alpha>=97 || alpha>=122){

            System.out.println("Please Enter the alphabet in uppercase");
        }
        else {
            System.out.println("Your alphabet in lower case is : " + lowerCase);
        }

    }

}
