

import java.util.Scanner;
public class ReverseNumber{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int reverse=0;
		while(temp!=0){
			int remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;		
		}
		System.out.println("reverse number of "+num+" is "+reverse);
	}
}