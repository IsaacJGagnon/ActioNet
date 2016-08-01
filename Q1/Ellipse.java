import java.lang.Math;

public class Ellipse implements Shape{
	private double a, b;

	Ellipse(){
		a = 5;
		b = 5;
	}
	
	Ellipse( double x, double y ){
		if(x > y){
			a = x;
			b = y;
		} else {
			a = y;
			b = x;
		}
	}
	
	public double getArea(){
		return Math.PI * a * b;
	}
	
	public double getPerimeter(){
		if(a == 0 && b == 0){
			return a;
		}
		double h = Math.pow(a-b,2)/Math.pow(a+b,2);
		return Math.PI * (a+b) *(1+((3*h)/(10+Math.sqrt(4-(3*h)))));
	}
}
