import java.util.Scanner;

public class prg5_shapesConstructorOverloading {
	float A ;

	prg5_shapesConstructorOverloading(int a) {
		A = a*a;
		System.out.println("The area of square is : "+A);
		
	}
	
	prg5_shapesConstructorOverloading(int a, int b) {
		A = a*b;
		System.out.println("The area of rectangle is : " +A);
	}

	prg5_shapesConstructorOverloading(float b, float h) {
		A = (float)((1.0/2.0)*(b*h));
		System.out.println("The area of Triangle is : " +A);
	}
	
	prg5_shapesConstructorOverloading(float r) {
		A = (float) (3.14*r*r);
		System.out.println("The area of circle is : " +A);
	}
}

class ShapesDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int a, b;
		float b1,h,r;
		System.out.println("Enter the side value of the square : ");
		a=sc.nextInt();
		
		prg5_shapesConstructorOverloading square = new prg5_shapesConstructorOverloading(a);
		
		System.out.println("Enter the side value of the rectangle : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		prg5_shapesConstructorOverloading rectangle = new prg5_shapesConstructorOverloading(a,b);
	
		
		System.out.println("Enter the side value of the triangle : ");
		b1=sc.nextFloat();
		h=sc.nextFloat();
		
		prg5_shapesConstructorOverloading triangle = new prg5_shapesConstructorOverloading(b1,h);
		
		
		System.out.println("Enter the radius of circle : ");
		r=sc.nextFloat();
		
		prg5_shapesConstructorOverloading circle = new prg5_shapesConstructorOverloading(r);
	}
}