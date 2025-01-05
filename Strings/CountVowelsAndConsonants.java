

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CountVowelsAndConsonants{
	
	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char [] charArray=str.toLowerCase().toCharArray();
		char [] vowels="aeiou".toCharArray();

		int vowelsCount=0;
		int consonantCount=0;
		for(char ch:charArray){
			if(ch>='a' &&ch<='z'){
				if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
					vowelsCount++;
				}else{
					consonantCount++;
				}
			}
		}
		System.out.println("vowelCount: "+vowelsCount);
		System.out.println("consonantCount: "+consonantCount);
		
	}


}