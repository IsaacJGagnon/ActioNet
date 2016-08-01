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
		double tmp = s * (s - sideA) * (s - sideB) * (s - sideC);
		if(tmp<0){
			return 0;
		} else {
			return Math.sqrt(tmp);
		}
	}
	
	public double getPerimeter(){
		return sideA + sideB + sideC;
	}
}
