import java.util.Scanner;

public class PassFailGradeResult {

        static int total;
        static double percentage;

        public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Student : ");
        String name = scanner.nextLine();
        System.out.println("Enter the Roll number of the student : ");
        int roll = scanner.nextInt();
        System.out.println("Enter the marks of Maths : ");
        int maths = scanner.nextInt();
        System.out.println("Enter the marks of Hindi : ");
        int hindi = scanner.nextInt();
        System.out.println("Enter the marks of English : ");
        int english = scanner.nextInt();

        total = maths + hindi + english;
        if (total > 300) {

            System.out.println("subject marks are exceeding the limit of 300 please enter valid marks!");

        } else if (total < 0) {

            System.out.println("We do not have negative marking system so please enter your valid marks! " + total + ": is your total");

        } else {

            System.out.println("Your total marks are : " + total);
        }
        percentage = total / 3;
        System.out.println("Your Percentage is : " + percentage);

        if (percentage >= 80 && maths>=35 && hindi>=35 && english>=35) {

            System.out.println("Your Grade is A+");

        } else if (percentage >= 60 && maths>=35 && hindi>=35 && english>=35) {

            System.out.println("Your Grade is A");

        } else if (percentage >= 50 && maths>=35 && hindi>=35 && english>=35) {

            System.out.println("Your Grade is B");

        } else if (percentage >= 35 && maths>=35 && hindi>=35 && english>=35) {

            System.out.println("Your Grade is C");

        } else {

            System.out.println("You have failed the exam");
        }

    }

}