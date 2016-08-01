import java.lang.Math;

public class Rectangle implements Shape{
	private double length, width;

	Rectangle(){
		length = 5;
		width = 5;
	}
	
	Rectangle( double l, double w){
		length = l;
		width = w;
	}
	
	public double getArea(){
		return length * width;
	}
	
	public double getPerimeter(){
		return 2 * (length + width);
	}
}
