import java.util.Scanner;

public class NumAlphaSymbol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value between 0 to 9 or Enter an Alphabet or Enter a Symbol : ");
        char value = scanner.next().charAt(0);
        
        if ((value>='a' && value<='z') || (value>='A' && value<='Z')){

            System.out.println(value + " is an alphabet.");
            
        }

        else if (value>='0' && value<='9')

        {

            System.out.println(value + " is a number.");
            
        }

        else

        {

            System.out.println(value + " is a symbol.");

        }

    }

}
