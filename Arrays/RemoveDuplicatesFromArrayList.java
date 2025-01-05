
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList{
	public static void main (String [] args){
		
		
		
		List<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(7);
		
		//Approach 1
		List<Integer> streamUnique=arrayList.stream().distinct().toList();
		System.out.println("Using streams: "+streamUnique);
		
		//approach 2
		Set<Integer> set=new LinkedHashSet<>(arrayList);
		List<Integer>setUnique=new ArrayList<>(set);
		System.out.println("Using set : "+setUnique);
	}


}