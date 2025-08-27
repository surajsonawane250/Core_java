import java.util.Scanner;
public class EvenInclusive{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Start Element (X):");
		int x= sc.nextInt();
		
		System.out.println("Enter the Ending Element (y):");
		int y= sc.nextInt();

		for(int i=x;i<=y;i++){
			if(i%2==0){
			   System.out.println(i);
			}
		}
	}
}
		

