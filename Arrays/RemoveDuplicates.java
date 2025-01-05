
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class RemoveDuplicates{
	
	public static void main(String[] args){
		int array[]={7,35,23,7,4,6,8,35,4,43};
		//for to keep the same order we have to use LinkedHashSet.
		//Set <Integer> numSet=new HashSet<Integer>();
		//for(int num: array){
		//	numSet.add(num);
		//}
		//int [] uniqueArray=numSet.stream().mapToInt(Integer::intValue).toArray();
		//System.out.println(Arrays.toString(uniqueArray));
		
		int [] uniqueArray=Arrays.stream(array).distinct().toArray();
		System.out.println(Arrays.toString(uniqueArray));
	}

}