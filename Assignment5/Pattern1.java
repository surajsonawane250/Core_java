import java.util.Scanner;
public class Pattern1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the rows");
		int r=sc.nextInt();

		System.out.println("Enter the columns");
		int c=sc.nextInt();

		for( int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(j % 2 == 0){
					System.out.print(0);
					}	
				else{
					System.out.print(1);
				   }
			}
			System.out.println();

		}
				
	}
}
