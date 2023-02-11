import java.util.Scanner;

public class prg1_quadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter the value of a");
		
		a = sc.nextInt();
		
		if(a==0) {
			System.out.println("Not a quadratic equation");	
		}
		else {
			System.out.println("Enter the value of b and c");
			b = sc.nextInt();
			c = sc.nextInt();
			
			float d,r1,r2,ipart,rpart;
			
			d = (b*b) - (4*a*c);
			
			if(d==0) {
				r1 = (-b)/(2*a);
				r2 = r1;
				System.out.println("Root1 = " + r1);
				System.out.println("Root2 = "+r2);
				
			}
			else if(d>0) {
				r1 = (float) (((-b) + Math.sqrt(d))/(2*a));
				r2= (float) (((-b) - Math.sqrt(d))/(2*a));
				System.out.println("Root1 = " + r1);
				System.out.println("Root2 = " + r2);
				
			}
			else {
				rpart = (-b)/(2*a);
				ipart = (float) (Math.sqrt(-d)/(2*a));
				System.out.println("Root1= " + rpart + " + i " + ipart);
				System.out.println("Root2= "+ rpart + " - i "+ ipart);		
			}
		}
	}
}
