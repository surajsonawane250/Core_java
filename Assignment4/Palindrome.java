import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int rev=0;

		int temp=n;
		while(n>0){
			int rem = n % 10;
			 rev = rev * 10 + rem;
			n = n / 10;
		}
		if(rev==temp)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is Not Palindrome");
	}
}

