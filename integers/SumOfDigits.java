
import java.util.Scanner;

public class SumOfDigits{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get sum of its digits");
		int num=sc.nextInt();
		
		int temp=num;
		int result=0;
		while(temp!=0){
			int rem=temp%10;
			result+=rem;
			temp/=10;
		}
		System.out.println("The sum of digits of the number "+num+" is "+result);
	
	}
}