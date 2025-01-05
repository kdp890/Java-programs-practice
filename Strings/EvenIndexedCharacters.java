

import java.util.Scanner;

public class EvenIndexedCharacters{

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0; i<str.length();i+=2){
			System.out.print(str.charAt(i)+" ");
		}
	}
}