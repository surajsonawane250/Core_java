import java.util.Scanner;
public class Pattern2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number");
		int n=sc.nextInt();

		

		for( int i=1;i<=n;i++){
			for(int j=n;j>=n-i+1;j--)
				{
				System.out.print(j);
				}
			System.out.println();

			}
			
		}
				
	}
