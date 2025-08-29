import java.util.Scanner;
public class ArmstrongN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

      

        for (int i = 1; i <= n; i++) {
            int num = i;
            int cnt = 0;
            double res = 0;

            
            int temp = num;
            while (temp > 0) {
                cnt++;
                temp /= 10;
            }

              temp = num;
            while (temp > 0) {
                int rem = temp % 10;
                res += Math.pow(rem, cnt);
                temp /= 10;
            }

           
            if (res == num) {
                System.out.println(num);
            }
        }

          }
}
