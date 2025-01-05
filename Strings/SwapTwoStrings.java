
import java.util.Scanner;

public class SwapTwoStrings{
//swap two Strings without using third variable;
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first word");
		String str1=sc.next();
		System.out.println("Enter second word");
		String str2=sc.next();
		System.out.println("Before swaping: str1="+str1+",str2="+str2);
		str1+=str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After swaping: str1="+str1+",str2="+str2);
		
	
	}

}