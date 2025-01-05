
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
public class LongestWithoutCharRepeat{
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=sc.next();
		System.out.println("Enter String 2");
		String s2=sc.next();
		System.out.println("Enter String 3");
		String s3=sc.next();
		System.out.println("Enter String 4");
		String s4=sc.next();
		
		Map<Integer,String> stringLengths=new HashMap<>();
		stringLengths.put(findTheLength(s1),s1);
		stringLengths.put(findTheLength(s2),s2);
		stringLengths.put(findTheLength(s3),s3);
		stringLengths.put(findTheLength(s4),s4);
		Integer max=findTheLength(s1);
		for(Integer length: stringLengths.keySet()){
			if(max<length){
				max=length;
			}
		}
		System.out.println("The longest Without repeating characters is "+stringLengths.get(max));
		
	}
	
	public static int findTheLength(String str){
		int length=0;
		Set<Character> uniqueChars=new HashSet<>();
		for(char ch:str.toCharArray()){
			uniqueChars.add(ch);
		}
		return uniqueChars.size();
	}

}