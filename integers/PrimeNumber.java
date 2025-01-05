
import java.util.Scanner;
public class PrimeNumber{
	
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check is prime number or not :");
		int num=sc.nextInt();
		if(isPrimeNumber(num)){
			System.out.println(num+" is a prime number");
		}else{
			System.out.println(num+" is not a prime number");
		}
	}
	
	public static boolean isPrimeNumber(int num){
		for(int i=2;i<=num/2;i++){
			if(num%2==0){
				return false;
			}
		}
		return true;
	}
}