import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter limit : ");
		Scanner s=new Scanner(System.in);
		
		int limit=s.nextInt();
		
		for(int i=2;i<=limit;i++) {
			if(i%2==0){
			 System.out.println(""+i);
			}
		}
	}
}
