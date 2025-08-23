import java.util.Scanner;
public class EvenOddConditional{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		 
		String res=(num % 2 ==0) ? "Number is Even":"Number is odd";
		System.out.println(" "+res);

	}
}