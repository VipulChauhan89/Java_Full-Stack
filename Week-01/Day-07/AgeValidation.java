import java.util.*;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        try {
            int age = sc.nextInt();
            if(age < 0) {
                throw new IllegalArgumentException();
            }
            System.out.println("Valid age.");
        } catch (InputMismatchException | IllegalArgumentException e ) {
            System.out.println("Invalid age.");
        }
    }
}
