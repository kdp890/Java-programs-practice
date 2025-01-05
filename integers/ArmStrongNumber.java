
import java.util.Scanner;
public class ArmStrongNumber{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int result=0;
		while(temp!=0){
			int rem=temp%10;
			result+=rem*rem*rem;
			temp/=10;
		}
		if(result==num){
			System.out.println("The given number "+num+" is ArmStrongNumber");
		}else{
			System.out.println("The given number "+num+" is not ArmStrongNumber");
		}
		
		
	}

}