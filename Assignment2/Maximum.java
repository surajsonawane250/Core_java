import java.util.Scanner;
public class Maximum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		int num1=sc.nextInt();

		System.out.println("Enter the second Number");
		int num2=sc.nextInt();

		System.out.println("Enter the third Number");
		int num3=sc.nextInt();

		if( (num1 >= num2) && (num1 >= num3))
		{
			System.out.println(num1+ " number1 is max");
		}
		else if((num2 >= num3) &&(num2 >= num1))
		{	
			System.out.println(num2+" number2 is max");
		}
		else
		{
			System.out.println(num3 + " number3 is max");
		}
	}
}