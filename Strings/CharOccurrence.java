
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CharOccurrence{

	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char [] charArray=str.toCharArray();
		Map<Character , Integer> charMap=new HashMap<>();
		for(char ch : charArray){
			if(charMap.containsKey(ch)){
				charMap.put(ch ,charMap.get(ch)+1);
			}else{
				charMap.put(ch,1);
			}
		}
		System.out.println("count of characters in a given String :"+ charMap);
	
	}

}