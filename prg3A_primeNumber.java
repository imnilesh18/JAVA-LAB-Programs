import java.util.Scanner;

public class prg3A_primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the value of n");
		
		n = sc.nextInt();
		
		int count=0;
		int i;
		
		for(i=1;i<=n;i++) {
			if(n%i==0) {
			count++;
			}
		}
		
		if(count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
}