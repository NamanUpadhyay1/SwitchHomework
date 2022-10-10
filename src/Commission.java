import java.util.Scanner;

public class Commission {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the Seller : ");
        String name = scanner.next();
        System.out.println("Sales ID : ");
        int id = scanner.nextInt();
        System.out.println("Sales Amount : ");
        int amount = scanner.nextInt();
        System.out.println("Basic Salary : ");
        int salary = scanner.nextInt();


        double thirtyfive = amount*0.35;
        double twenty = amount*0.2;
        double ten = amount*0.1;
        double five = amount*0.05;
        double less = amount*0.02;

        if (amount>=50000){

            System.out.println("The seller will get " + thirtyfive + " as commission.");

        } else if (amount>= 30000) {

            System.out.println("The seller will get " + twenty + " as commission.");
            
        } else if (amount>=20000) {

            System.out.println("The seller will get " + ten + " as commission.");
            
        } else if (amount>=10000) {

            System.out.println("The seller will get " + five + " as commission");
            
        } else if (amount<10000) {

            System.out.println("The seller will get " + less + " as commision");
            
        }

    }
}
