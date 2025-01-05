import java.util.Arrays;

public class SortArray{

	public static void main(String [] args){
		int array[]={7,35,23,1,4,6,8,10,87,43};
		System.out.println("before sorting : "+Arrays.toString(array));
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("after sorting  : "+Arrays.toString(array));
	}
}