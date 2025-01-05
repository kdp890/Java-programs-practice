
import java.util.Scanner;

public class Palindrome{

	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is palindrome or not:");
		int num=sc.nextInt();
		int temp=num;
		int result=0;
		while(temp!=0){
			 int rem=temp%10;
			 result=result*10+rem;
			 temp/=10;
		}
		if(result==num){
			System.out.println("The given number "+num +" is palindrome");
		}else{
			System.out.println("The given number "+num +" is not a palindrome");
		}
		
		
	}
}