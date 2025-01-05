
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class UniqueCharacters{
	
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Map<Character, Integer> charCount=new HashMap<>();
		for(char ch:str.toCharArray()){
			charCount.put(ch,charCount.getOrDefault(ch,0)+1);
		}
		
		for(Character ch :charCount.keySet()){
			if(charCount.get(ch)==1){
				System.out.print(ch +" ");
			}
		}
	}

}