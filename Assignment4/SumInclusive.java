import java.util.Scanner;
public class SumInclusive{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the Start element (X):");
		int x=sc.nextInt();
		
		System.out.println("Enter the Ending element (y):");
		int y=sc.nextInt();

		for(int i=x;i<=y;i++)
		{
			sum+=i;
		 }
	System.out.println("Sum of Inclusive Element:"+sum);
	}
}