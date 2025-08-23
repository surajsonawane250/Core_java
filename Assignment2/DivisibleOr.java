import java.util.Scanner;
public class DivisibleOr{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();	
		
		if((number % 5 == 0) || (number % 7 == 0))
		{
			System.out.println(number+"is Divisible by 5 or 7");
		}
		else if((number % 5 != 0) || (number % 7 != 0))
		{ 
			System.out.println(number+"is not Divisible by 5 or 7");

		}
	}
}