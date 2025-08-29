import java.util.Scanner;

public class PerfectN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

       

        for (int num = 1; num <= n; num++) {
            int sum = 0;

             for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

                       if (sum == num) {
                System.out.println(num);
            }
        }

     
    }
}
