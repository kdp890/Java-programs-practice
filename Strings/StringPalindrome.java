
import java.util.Scanner;
public class StringPalindrome{

	public static void main(String args[]){
	
	
		//read string 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		
		System.out.println(isPalindrome(str));
		////create result Strng;
		//String result="";
		////loop it from end 
		//for(int i=str.length()-1;i>=0;i--){
		//	//concatinate with new String
		//	result+=str.charAt(i);
		//}		
		////check if the reversed string is palindrome or not 
		//if(result.equals(str)){
		//	System.out.println("The Entered String is Palindrome");
		//}else{
		//	System.out.println("The entered String is not palindrome");
		//}
		
		
	}
	
	static boolean isPalindrome(String str){
		int start=0;
		int end=str.length()-1;
		
		while(start<end){
			if(str.charAt(start)!=str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	

}