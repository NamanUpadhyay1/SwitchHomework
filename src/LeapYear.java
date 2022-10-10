import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        if (year%4==0){

            System.out.println("The Year " + year + " is a Leap Year.");

        }

        else{

            System.out.println("The Year " + year + " is not a Leap Year.");

        }

    }

}
