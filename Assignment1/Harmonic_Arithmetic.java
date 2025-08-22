import java.util.Scanner;
public class Harmonic_Arithmetic{
	public static void main(String args[]){
		int a,b;
		int AM,HM;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number");
		a=sc.nextInt();

		System.out.println("Enter the second Number");
		b=sc.nextInt();
		
		AM=(a+b)/2;
		System.out.println("Arithmetic mean:"+AM);

		
		HM=(a*b/(a+b));
		System.out.println("Harmonic mean:"+HM);
}
}
		