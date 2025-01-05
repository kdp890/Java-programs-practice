

import java.util.Scanner;
import java .util.Arrays;

public class AnargamsCheck{
	
	
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word");
		String str1=sc.next();
		System.out.println("Enter the second word");
		String str2=sc.next();
		
		char [] charArray1=str1.toCharArray();
		
		char [] charArray2=str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1,charArray2)){
			System.out.println(str1+" and "+str2 +" are anargams");
		}else{
			System.out.println(str1+" and "+str2+" are not anargams");
		}
		
		
	}
}