import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		int flag=1;
		
		if( n%2==0 || n%3==0){
			flag=1;
		}
		else {
			for( int i=5;i<=Math.sqrt(n);i+=6)
			{
				if(n%i==0 || n%(i+2)==0)	
				{
					flag=0;
					break;
				}
			}
		}
		if(flag == 1){
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is Not Prime");
		}
	}
}