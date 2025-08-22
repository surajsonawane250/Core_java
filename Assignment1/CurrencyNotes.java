import java.util.Scanner;
public class CurrencyNotes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the withdraw amount");
		int amount=sc.nextInt();

		int tens=amount / 10;
		amount %=10;
		int fives=amount / 5;
		amount %=5;
		int ones=amount;


		System.out.println("10:"+tens);
		System.out.println("5:"+fives);
		System.out.println("1:"+ones);
	}
}