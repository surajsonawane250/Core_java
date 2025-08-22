import java.util.Scanner;
public class AreaCircumferCircle{
	public static void main(String args[]){
 		
	    float r;
	    double area,cirumference;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Radius");
	    r=sc.nextFloat();
	    
 	    area=Math.PI*r*r;
 	    System.out.println("Area of Circle:"+area);
	    cirumference=2*Math.PI*r;
	    System.out.println("Circumference of Circle:"+cirumference);
	}
}

		


