
import java.util.Arrays;

public class FindMissingNumber{

		public static void main(String [] args){
			int[] array = {1, 2, 4, 5, 6}; // ,missing number is 3
			
			//approach 1
			int missingNumber=0;
			for(int i=0 ;i<array.length-1;i++){
				int temp=array[i+1];
				if(array[i]+1!=temp){
					missingNumber=array[i]+1;
				}
			}
			System.out.println(missingNumber);
			
			//approach 2
			System.out.println(findMissingNumber(array));
			
		}
		
		public static int findMissingNumber(int [] array){
			int n=array.length+1; //since one number is missing the length should be n+1;
			int totalSum=n*(n+1)/2; //sum of first n natural numbers
			
			int arraySum=0;
			for(int num: array){
				arraySum +=num;
			}
			return totalSum - arraySum;
			
		}
}