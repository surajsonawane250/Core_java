import java.util.Scanner;
public class Divisible57{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();

		if((num % 5 == 0) && (num % 7 == 0))
		{
			System.out.println(num+ "is divisible by 5 and 7");
		}
		else
		{
			System.out.println(num+ "is  Not divisible by 5 and 7");
		}
	}
}
		
	