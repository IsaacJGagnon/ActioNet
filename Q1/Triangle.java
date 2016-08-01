import java.lang.Math;

public class Triangle implements Shape{
	private double sideA, sideB, sideC;

	Triangle(){
		sideA = 3;
		sideB = 4;
		sideC = 5;
	}
	
	Triangle( double a, double b, double c){
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	public double getArea(){
		double s = (sideA + sideB + sideC)/2;
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}
	
	public double getPerimeter(){
		return sideA + sideB + sideC;
	}
}
