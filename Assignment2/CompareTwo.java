import java.util.Scanner;
public class CompareTwo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		int num2=sc.nextInt();

		if( num1 > num2)
		{
			System.out.println(num1+ " First number is Greater");
		}
		else if( num1 < num2)
		{
			System.out.println(num2+ " second Number is Greater");
		}
		if( num1 == num2)
		{
			System.out.println("Numbers are Same");
		}
	}
}