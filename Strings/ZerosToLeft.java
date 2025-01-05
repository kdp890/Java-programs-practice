

import java.util.Scanner;

public class ZerosToLeft{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		StringBuilder nonZeroDigits=new StringBuilder();
		StringBuilder zeros=new StringBuilder();
		
		for(char ch:str.toCharArray()){
			if(ch=='0'){
				zeros.append(ch);
			}else if(Character.isDigit(ch)){
				nonZeroDigits.append(ch);
			}
		}
		
		System.out.println(""+zeros+nonZeroDigits);
	
	}

}