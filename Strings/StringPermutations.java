
import java.util.Scanner;
public class StringPermutations{
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String empty="";
		permute(empty,str);
	}
	//ABC
	public static void permute(String prefix,String str){
		if(str.length()==0){
			System.out.println(prefix);
		}else{
			for(int i=0;i<str.length();i++){
				String rem=str.substring(0,i)+str.substring(i+1);
				permute(prefix+str.charAt(i),rem);
			}
		}	
		
	}
	
}