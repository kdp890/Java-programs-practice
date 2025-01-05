import java.util.Scanner;
public class NumberOfDigits{
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to get digitCount");
		int num=sc.nextInt();
		int temp=num;
		int digitCount=0;
		if(temp<0){
		temp*=-1;
		}else if(temp==0){
		 digitCount=1;
		}
		while(temp>0){
			temp/=10;
			digitCount++;
		}
		System.out.println("The digit count of the given number "+ num +" is "+digitCount);
	}
}