import java.util.Scanner;
public class HelloNtimes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter the N:");
		int n=sc.nextInt();

		for( int i=0;i<n;i++)
			System.out.println("Hello World.!!");
	}
}
