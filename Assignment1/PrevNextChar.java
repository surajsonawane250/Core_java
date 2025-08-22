import java.util.Scanner;
public class PrevNextChar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Character:");
		char ch=sc.next().charAt(0);

		char Prev=(char)(ch-1);
		char Next=(char)(ch+1);

		System.out.println("Previous character:"+Prev);
		System.out.println("Next character:"+Next);
	}
}