
import java.util.Set;
import java.util.HashSet;
public class FindCommonElements{
	
	public static void main(String [] args){
		int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
		Set<Integer> commonElements=new HashSet<>();
		for(int num: array1){
			for(int num1:array2){
				if(num==num1){
				 commonElements.add(num);
				}
			}
		}
		System.out.println(commonElements);
	
	}
}