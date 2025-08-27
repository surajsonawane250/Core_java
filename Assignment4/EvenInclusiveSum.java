import java.util.Scanner;
public class EvenInclusiveSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the  Start Element (X):");
		int x= sc.nextInt();
		
		System.out.println("Enter the Ending Element (y):");
		int y= sc.nextInt();

		for(int i=x;i<=y;i++){
			if(i%2==0){
			  sum+=i;
			}
		}
		System.out.println(sum);
	}
}
		

