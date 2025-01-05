
import java.util.Scanner;
public class SearchElementInArray{
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the find number");
		int findNum=sc.nextInt();
		int array[] =new int []{12,35,53,343,33,23,5,6,7,8,9};

		//approach 1
		String result="";
		for(int i=0;i<array.length;i++){
			if(array[i]==findNum){
				result="The given number "+findNum+" found at index: "+i; 
			}
		}
		if(!result.isEmpty()){
			System.out.println(result);
		}else{
			System.out.println("The given number "+findNum+" not found in the array");
		}
		
		//approach 2
		int index=findIndexOfValue(findNum,array);
		if(index!=-1){
			System.out.println("The given number "+findNum+" found at index: "+index);
		}else{
			System.out.println("The given number "+findNum+" not found in the array");
		}
			
		
	}
	
	public static int findIndexOfValue(int findNum,int[] array){
		
		for(int i=0;i<array.length;i++){
			if(array[i]==findNum){
				return i;
			}
		}
		return -1;
	}
	

}