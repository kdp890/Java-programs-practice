
import java.util.Scanner;

public class SeparateAlpaetsAndIntegers{

	public static void main (String [] args){
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		StringBuilder integers=new StringBuilder();
		StringBuilder alphabets=new StringBuilder();
		for(char ch: str.toCharArray()){
			if(Character.isDigit(ch)){
				integers.append(ch);
			}else if(Character.isLetter(ch)){
				alphabets.append(ch);
			}
		}
		System.out.println(alphabets+" , "+integers);
	
	}

}