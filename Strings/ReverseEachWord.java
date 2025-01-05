
import java.util.Scanner;
public class ReverseEachWord{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a sentence to reverse its words");
		String str=sc.nextLine();
		String strArray[]=str.split(" ");
		
		String reverse="";
		for(String item:strArray){
			reverse+=reverseString(item)+" ";
		}
		System.out.println(reverse);
		
	}
	
	public static String reverseString(String str){
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	
}