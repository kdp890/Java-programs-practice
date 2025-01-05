
import java.util.Scanner;
public class Factorial{

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter factorial number");
		int num=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=num;i++){
			factorial*=i;
		}
		if(num==0){
			System.out.println(0);
		}else{
			System.out.println(factorial);
		}
		
	}
}