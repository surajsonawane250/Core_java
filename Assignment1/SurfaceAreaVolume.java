import java.util.Scanner;
public class SurfaceAreaVolume{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float l,b,h;
		float sarea,volume;
		System.out.println("Enter the Length");
		l=sc.nextFloat();
		System.out.println("Enter the breadth");
		b=sc.nextFloat();
		System.out.println("Enter the height");
		h=sc.nextFloat();

		sarea=2*((l*b)+(l*h)+(b*h));
		System.out.println("cuboid Surface Area:"+sarea);

		volume=l*b*h;
		System.out.println("volume :"+volume);
	}
}