import java.util.Scanner;
public class Swapping{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter First Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swapping A & B:" +a+" "+b);
	}
}

	
