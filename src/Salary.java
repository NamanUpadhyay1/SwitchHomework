import java.util.Scanner;

public class Salary {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of Employee : ");
        String name = scanner.nextLine();
        System.out.println("Enter the ID of Employee : ");
        int id = scanner.nextInt();
        System.out.println("Enter the Basic Salary : ");
        double salary = scanner.nextDouble();

        double hra=salary * 0.1;
        double da=salary * 0.08;
        double ta=salary * 0.09;
        double pf=salary * 0.2;

        System.out.println(hra + " for HRA");
        System.out.println(da + " for DA");
        System.out.println(ta + " for TA");
        System.out.println(pf + " cut off for PF");

        double gross = (salary+hra+ta+da)-pf;
        System.out.println("Gross Salary of " + name + " is " + gross);

    }

}
