import java.util.Scanner;

public class Week {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7 : ");
        int num = scanner.nextInt();

        switch (num){

            case 1:
                System.out.println(num + " is for Monday");
                break;
            case 2:
                System.out.println(num + " is for Tuesday");
                break;
            case 3:
                System.out.println(num + " is for Wednesday");
                break;
            case 4:
                System.out.println(num + " is for Thursday");
                break;
            case 5:
                System.out.println(num + " is for Friday");
                break;
            case 6:
                System.out.println(num + " is for Saturday");
                break;
            case 7:
                System.out.println(num + " is for Sunday");
            default:
                System.out.println("Please enter a number between 1 to 7.");

        }

    }

}