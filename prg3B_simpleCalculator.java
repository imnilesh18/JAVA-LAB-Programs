import java.util.Scanner;

public class prg3B_simpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		float result;
		System.out.println("Enter the value of n1 and n2: ");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		String ch;
		System.out.println("Enter the operator:");
		ch = sc.next();
		char op = ch.charAt(0);
		
		switch(op){
			case '+':
				result = n1 + n2;
				System.out.println("Result = " + result);
				break;
				
			case '-':
				result = n1 - n2;
				System.out.println("Result = " + result);
				break;
			case '*':
				result = n1*n2;
				System.out.println("Result = " + result);
				break;
			case '/':
				if(n2==0) {
					System.out.println("Division not possible");
				}
				else {
					result = n1 / n2;
					System.out.println("Result = " + result);
				}
				break;
			case '%':
				if(n2==0) {
					System.out.println("Modulus not possible");
				}
				else {
					result = n1 % n2;
					System.out.println("Result = " + result);					
				}
				break;
	
		}
	}

}