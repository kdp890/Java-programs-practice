
import java.util.Scanner;
import java.util.Arrays;

public class DivideCases{

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		StringBuilder lowerCase=new StringBuilder();
		StringBuilder upperCase=new StringBuilder();
		
		for(char ch : str.toCharArray()){
			if(Character.isLowerCase(ch)){
				lowerCase.append(ch);
			}else{
				upperCase.append(ch);
			}
		}
		char [] lowerCaseArray=lowerCase.toString().toCharArray();
		char [] upperCaseArray=upperCase.toString().toCharArray();
		Arrays.sort(lowerCaseArray);
		Arrays.sort(upperCaseArray);
		System.out.println(String.valueOf(lowerCaseArray)+" , "+String.valueOf(upperCaseArray));
	
	}

}