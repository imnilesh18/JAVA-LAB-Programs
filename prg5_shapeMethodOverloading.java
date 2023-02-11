import java.util.Scanner;

public class prg5_shapeMethodOverloading {
	float A ;

	void Area(int a) {
		A = a*a;
		System.out.println("The area of square is : "+A);
		
	}
	
	void Area(int a, int b) {
		A = a*b;
		System.out.println("The area of rectangle is : " +A);
	}

	void Area(float b, float h) {
		A = (float)((1.0/2.0)*(b*h));
		System.out.println("The area of Triangle is : " +A);
	}
	
	void Area(float r) {
		A = (float) (3.14*r*r);
		System.out.println("The area of circle is : " +A);
	}
}

class ShapeDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int a, b;
		float b1,h,r;
		System.out.println("Enter the side value of the square : ");
		a=sc.nextInt();
		
		prg5_shapeMethodOverloading square = new prg5_shapeMethodOverloading();
		square.Area(a);
		
		System.out.println("Enter the side value of the rectangle : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		prg5_shapeMethodOverloading rectangle = new prg5_shapeMethodOverloading();
		rectangle.Area(a,b);
		
		System.out.println("Enter the side value of the triangle : ");
		b1=sc.nextFloat();
		h=sc.nextFloat();
		
		prg5_shapeMethodOverloading triangle = new prg5_shapeMethodOverloading();
		triangle.Area(b1,h);
		
		System.out.println("Enter the radius of circle : ");
		r=sc.nextFloat();
		
		prg5_shapeMethodOverloading circle = new prg5_shapeMethodOverloading();
		circle.Area(r);
		}
}