import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int cnt=0;
		int temp=n;
       		double res=0;
		
		while(n>0){
			cnt++;
			n=n/10;
		}
		
		n=temp;

		while(n>0){
			int rem=n%10;
			res=res+Math.pow(rem,cnt);
			n=n/10;
		}
		if(res == temp){
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is Not Armstrong");
		}
	}
}


			
		