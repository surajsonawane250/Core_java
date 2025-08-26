import java.util.Scanner;
public class Operationperform{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice operations(+,-,*,/)");
		char ch=sc.next().charAt(0);

		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		int b=sc.nextInt();

		switch(ch)
		{
		case '+'->System.out.println("Addition :" +(a+b));
	
		case '-'->System.out.println("Substraction :" +(a-b));

		case '*'->System.out.println("Multiplication :" +(a*b));
	
		case '/'->System.out.println("Division :" +(a/b));


		default->
			System.out.println("Error");
		}
}
}
			  
			