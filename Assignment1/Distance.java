import java.util.Scanner;
public class Distance{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X1:");
		double x1=sc.nextDouble();
		System.out.println("Enter the X2:");
		double x2=sc.nextDouble();
		System.out.println("Enter the y1:");
		double y1=sc.nextDouble();
		System.out.println("Enter the y2:");
		double y2=sc.nextDouble();


		double distance=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

		System.out.println("Distance of Two points:"+distance);
	}
}
	
		


		
