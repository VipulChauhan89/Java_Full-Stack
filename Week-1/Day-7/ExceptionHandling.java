import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers to perform the Division");
        try {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int division = first/second;
            System.out.println("Division of the numbers " + first + "/" + second + " = " + division);
        } catch(ArithmeticException e) {
            System.out.println("Divide by zero exception occured.");
        } catch(InputMismatchException e) {
            System.out.println("Invalid input exception occured.");
        }
    }
}
