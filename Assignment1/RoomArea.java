import java.util.Scanner;
public class RoomArea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of Room");
		double length=sc.nextDouble();

		System.out.println("Enter breadth of Room");
		double breadth=sc.nextDouble();

		System.out.println("Enter height of Room");
		double height=sc.nextDouble();

		System.out.println("Enter door area");
		double doora=sc.nextDouble();
		
		System.out.println("Enter window area");
		double windowa=sc.nextDouble();

		double wallsarea=2*(length+breadth)*height;

		double paintarea=wallsarea-doora-2*windowa;

		double roofArea=length*breadth;


		System.out.println("Paintable walls area:"+paintarea);
		System.out.println("roof area:"+roofArea);
	}
}




		