import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Letter between A to F : ");
        char letter = scanner.next().charAt(0);
        System.out.println(letter);

        switch (letter){

            case 'a':
                System.out.println("A stands for Ahmedabad");
                break;
            case 'b':
                System.out.println("B stands for Bacolod City PH");
                break;
            case 'c':
                System.out.println("C stands for Chicago");
                break;
            case 'd':
                System.out.println("D stands for Doha");
                break;
            case 'e':
                System.out.println("E stands for Essen Germany");
                break;
            case 'f':
                System.out.println("F stands for Fukushima");
                break;
            default:
                System.out.println("Please select between A to F");

        }

    }

}
