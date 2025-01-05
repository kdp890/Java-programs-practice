
import java.util.Scanner;
public class FibonacciSeries{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number for range of fibonacci series");
			int range=sc.nextInt();
			int n1=0;
			int n2=1;
			int sum;
			for(int i=0; i<range;i++){
				sum=n1+n2;
				System.out.print(n1+" ");
				n1=n2;
				n2=sum;
			}
		}

}