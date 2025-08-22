import java.util.Scanner;

public class AreaOfCircle{
 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
	float r;
	double area;
	System.out.println("Enter the Radius");
	r=sc.nextFloat();
        area=Math.PI*r*r;
	System.out.println("Area Of Circle"+area);
}
}
