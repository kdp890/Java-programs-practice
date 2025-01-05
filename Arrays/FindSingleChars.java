

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class FindSingleChars{
	
	public static void main(String [] args){
		int [] array=new int[]{1,1,2,2,3,4,5,5,6,6};
		Map<Integer,Integer> count=new HashMap<>(); 
		for(int num:array){
			if(count.get(num)!=null){
				count.put(num,count.get(num)+1);
			}else{
				count.put(num,1);
			}
		}
		List <Integer> singleNumbers=new ArrayList<>();
		for(int num:count.keySet()){
			if(count.get(num)==1){
				singleNumbers.add(num);
			}
		}
		System.out.println(singleNumbers);
	
	}

}