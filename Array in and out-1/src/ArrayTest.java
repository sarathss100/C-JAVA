import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		System.out.println("Enter values : ");
		int []a=new int[100];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) { 
		     a[i]=s.nextInt();
		}
		System.out.println("Entered values are : ");
		for(int i=0;i<5;i++) {
			System.out.print(" "+a[i]); 
		}
	}
}
