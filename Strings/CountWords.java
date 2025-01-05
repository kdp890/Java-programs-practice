
import java.util.Scanner;
public class CountWords{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		//String strArray[]=str.split(" ");
		//System.out.println(strArray.length);
		
		int count=1;
		
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
				count++;
			}
		}
		System.out.println("Number of words in a String: "+ count);
		
	}
}
//Enter the String : Welcome to java world
//Number of words in a String: 4