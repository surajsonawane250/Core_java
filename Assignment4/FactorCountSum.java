import java.util.Scanner;
public class FactorCountSum{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Number");
		int n=sc.nextInt();

		int cnt=0;
		int sum=0;

		for(int i=1;i<=n;i++){
			if(n % i == 0){
				System.out.println(i);
			cnt++;
			sum= sum + i;
			}
		}
	System.out.println("Count of Factor"+cnt);
	System.out.println("Sum of Factor"+sum);
	}
}

		
		
		
		
