
import java.util.List;
import java.util.ArrayList;
public class FindFirstAndLast{
	
	public static void main(String [] args){
		List<String> stringsList=new ArrayList<>();
		stringsList.add("durga");
		stringsList.add("prasad");
		stringsList.add("kalamati");
		if(!stringsList.isEmpty()){
			System.out.println("First Element : "+stringsList.get(0));
			System.out.println("Last Element : " +stringsList.get(stringsList.size()-1));
		}else{
			System.out.println("List is empty");
		}
	
	}

}