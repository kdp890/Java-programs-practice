
public class SumIntFromHeteroGeneousArray{
	
	public static void main(String[] args){
	
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		int sum=0;
		for(int i=0;i<array.length;i++){
			try{
			sum+=Integer.parseInt(array[i]);
			}catch(Exception e){}
		}
		System.out.println(sum);
	}

}