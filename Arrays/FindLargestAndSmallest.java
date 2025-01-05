
public class FindLargestAndSmallest{

	public static void main(String [] args){
	int [] array={1,5,2,7,3,210,722,123,232,533};
	
	//without sorting approach
		int [] result=findSmallestAndLarget(array);
		System.out.println("The smallest number in the array without sorting:"+result[0]);
		System.out.println("The largest number in the array without sorting:"+result[1]);
	
	//with sorting approach
		for(int i=0; i<array.length;i++){
			int temp=0;
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		if(array.length>0){
			System.out.println("The smallest number in the array with sorting :"+array[0]);
			System.out.println("The largest number in the array with sorting :"+array[array.length-1]);
		}else{
			System.out.println("Array is empty can't define smallest and largest number");
		}
	}
	
	public static int[] findSmallestAndLarget(int [] array){
		if(array==null || array.length==0){
			throw new IllegalArgumentException("Array sould not be empty or null");
		}
		
		int smallest =array[0];
		int largest =array[0];
		
		for(int num: array){
			if(num<smallest){
				smallest=num;
			}
			if(num>largest){
				largest=num;
			}
		}
		return new int[]{smallest,largest};
		
	}

}
