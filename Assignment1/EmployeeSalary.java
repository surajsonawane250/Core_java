import java.util.Scanner;
 public class EmployeeSalary{
 	public static void main(String args[])
{
	float da,hra,bs,tax,ts;
	int id;
	String name;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Details:");
	System.out.println("ID :");
	id=sc.nextInt();
	System.out.println("NAME :");
	name= sc.next();
	System.out.println("DA (%):");
	da=sc.nextFloat();
	System.out.println("HRA (%):");
	hra=sc.nextFloat();
	System.out.println("TAX (%):");
	tax=sc.nextFloat();
	System.out.println("Basic Salary:");
	bs=sc.nextFloat();

	ts=bs+((bs*(da+hra-tax))/100);
 	System.out.println("Total Salary:"+ts);
 

}

}