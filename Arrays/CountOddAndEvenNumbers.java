
public class CountOddAndEvenNumbers{
	
	public static void main(String [] args){
		int [] array=new int []{1,2,3,4,5,6,7,8,9,10,11}; 
		int oddCount=0;
		int evenCount=0;
		for(int num:array){
			if(num%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		System.out.println("odd numbers count : "+oddCount);
		System.out.println("even numbers count : "+evenCount);
		
	}
}