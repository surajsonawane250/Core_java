import java.util.Scanner;
public class BasicSalary{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Annual Basic Salary");
		double salary=sc.nextDouble();
		double tax;

		if(salary <= 150000)
		{
			tax=0;
		}
		else if( salary >= 150000 && salary <= 300000)
		{
			tax=salary * 0.20;
		}
		else
		{
			tax=salary * 0.30;
		}
			System.out.println(" Salary :"+salary);

			System.out.println("Tax :"+tax);
	}
}