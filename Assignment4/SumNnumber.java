import java.util.Scanner;
public class SumNnumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the N:");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
	System.out.println("sum of N numbers:"+sum);
	}
}
		