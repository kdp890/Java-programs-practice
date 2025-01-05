
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class DuplicateChar{
	
	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word for to check the duplicates characters");
		String str=sc.next();
		findDuplicates(str);
//		char [] charArray=str.toCharArray();
//
//		ArrayList<Character> duplicates=new ArrayList<>();
//		for(int i=0;i<charArray.length;i++){
//			int count=0;
//			for(int j=0;j<charArray.length;j++){
//				if(charArray[i]==charArray[j]){
//					count++;
//				}
//			}
//			if(count>1 && ! duplicates.contains(charArray[i])){
//				duplicates.add(charArray[i]);
//			}
//
//		}
//		System.out.println("Duplicate characters in array : "+duplicates);
	
	}

	public static void findDuplicates(String str){
		Map<Character,Integer> characterMap=new HashMap<>();
		char[] charArray=str.toCharArray();
		for(char ch: charArray){
			if(characterMap.containsKey(ch)){
				characterMap.put(ch ,characterMap.get(ch)+1);
			}else{
				characterMap.put(ch,1);
			}
		}
		
		Set<Character> charSet=characterMap.keySet();
		
		for(Character chr: charSet){
			if(characterMap.get(chr)>1){
				System.out.println(chr +" : "+characterMap.get(chr));
			}
		}

	}

}