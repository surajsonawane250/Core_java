import java.util.Scanner;
public class CountDigit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int cnt=0;

		while(n>0){
			cnt++;
			n=n/10;
		}
	System.out.println("Count od Digit:"+cnt);
	}
}