

import java.util.Scanner;
public class ReverseString{

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//StringBuilder str1=new StringBuilder(str);
		//System.out.println(str1.reverse());
		
		
		//char ch;
		//String reverse="";
		//for(int i=str.length()-1;i>=0;i--){
		//	reverse+=str.charAt(i);
		//}
		//System.out.println(reverse);
		
		String reverse="";
		for(char ch:str.toCharArray()){
			reverse=ch+reverse;
		}
		System.out.println(reverse);
	}
}