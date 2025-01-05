
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CharWithCount{

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
//		Map<Character,Integer> charCount=new HashMap<>();
//		for(char ch: str.toCharArray()){
//			charCount.put(ch,charCount.getOrDefault(ch,0)+1);
//		}
//		for(char ch:charCount.keySet()){
//			System.out.print(""+ch+charCount.get(ch));
//		}

		StringBuilder result=new StringBuilder();
		int count=1;
		//aabbcccdd
		for(int i=0;i<str.length();i++){
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
				count++;
			}else{
				result.append(str.charAt(i)).append(count);
				count=1;
			}
		}
		System.out.println(result.toString());
	}
}