import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter limit : ");
		Scanner sc=new Scanner(System.in);
		
		int limit=sc.nextInt();
		
		int []a=new int[100];
		System.out.println("Enter values : ");
		for(i=0;i<limit;i++) {
			a[i]=sc.nextInt();
		}
        
		for(i=0;i<limit-1;i++) {
			for(j=i+1;j<limit;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted values are : ");
		for(i=0;i<limit;i++) {
			System.out.print(" "+a[i]);
		}
	}
}
