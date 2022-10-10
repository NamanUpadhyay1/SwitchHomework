import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = scanner.nextInt();

        if (age<0 || age>118){

            System.out.println("Please Enter a valid Age.");
            
        } else if (age>=18) {

            System.out.println("You are Eligible to Vote.");
            
        }

        else {

            System.out.println("You are not Eligible to Vote yet.");

        }

    }

}
