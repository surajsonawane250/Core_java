import java.util.Scanner;

public class BetweenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter third number: ");
        int third = scanner.nextInt();

        if ((first > second && first < third) || (first > third && first < second)) {
            System.out.println(first + " is between " + second + " and " + third);
        }
	else {
            System.out.println(first + " is NOT between " + second + " and " + third);
        }

          }
}
