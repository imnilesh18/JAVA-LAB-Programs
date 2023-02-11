package prg10;

import java.util.Scanner;

public class EXP {

	public static void main(String[] args) {
		float res,a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a and b: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		try {
			if(b == 0) {
				throw new ArithmeticException();
					
			}
			res = a / b;
			System.out.println("Result : " +res);
			
		}
		catch(ArithmeticException e) {
			e.printStackTrace();	
		}
	}
}