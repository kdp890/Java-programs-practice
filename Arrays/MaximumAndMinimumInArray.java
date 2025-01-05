
public class MaximumAndMinimumInArray{

	public static void main (String [] args){
		int [] array=new int[]{2,43,12,7,1,67,9,32};
		
		System.out.println("Maximum number :"+findMaximum(array));
		System.out.println("Minimum number :"+findMinimum(array));
	
	
	}
	
	public static int findMaximum(int [] array){
		if(array==null && array.length==0){
			throw new IllegalArgumentException("Array must not be empty or null");
		}
		int max=array[0];
		for(int num:array){
			if(max<num){
				max=num;
			}
		}
		return max;
	}
	
	public static int findMinimum(int [] array){
		if(array==null && array.length==0){
			throw new IllegalArgumentException("Array should not empty or null");
		}
		int min=array[0];
		for(int num:array){
			if(min>num){
				min=num;
			}
		}
		return min;
	}
}