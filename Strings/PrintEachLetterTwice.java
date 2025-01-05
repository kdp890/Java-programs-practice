import java.util.Scanner;
public class PrintEachLetterTwice{
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder result=new StringBuilder();
		for(char ch: str.toCharArray()){
			result.append(ch);
			result.append(ch);
		}
		System.out.println(result);
	}
}