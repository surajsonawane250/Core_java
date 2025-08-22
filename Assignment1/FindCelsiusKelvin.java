import java.util.Scanner;
public class FindCelsiusKelvin{
 public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
    	float F;
 	double c,K;
  	
	System.out.println("Enter the ferenhiet:");
	F=sc.nextFloat();
  	 
 	c=(5/9*(F-32));
	System.out.println("Temprature in Celsius:"+c);
	
	K=c + 273.15;
	System.out.println("Temparture in Kelvin :"+K);
}
}
    