import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X");
		int x=sc.nextInt();
	
		System.out.println("Enter the N");
		int n=sc.nextInt();

		System.out.println("compute X and N:"+Math.pow(x,n));
	}
}