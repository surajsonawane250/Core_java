import java.util.Scanner;
public class FactorCount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Number:");
		int n=sc.nextInt();

		int cnt=0;

		for(int i=1;i<=n;i++){
			
			if(n % i == 0){
				cnt++;
			}
		}
		System.out.println("Count of Factor:"+cnt);
	}
}