import java.util.Scanner;
public class Traingle{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the first side of traingle");
	int a=sc.nextInt();

	System.out.println("Enter the second side of traingle");
	int b=sc.nextInt();

	System.out.println("Enter the third side of traingle");
	int c=sc.nextInt();

 	if( ((a+b) > c) && ((b+c) > a) && ((a+c) > b))
	{
		System.out.println("Traingle is Valid ");
	}
	else
	{
		System.out.println("Traingle is not valid");
	}
	}
}
