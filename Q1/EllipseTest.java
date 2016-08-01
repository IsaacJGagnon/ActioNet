import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

public class EllipseTest{
	final double pi = Math.PI;
	
	//ints
	Shape r1 = new Ellipse();
	Shape r2 = new Ellipse(7, 4);
	Shape r3 = new Ellipse(4, 7);
	//doubles
	Shape r4 = new Ellipse(1.1, 1.1);
	Shape r5 = new Ellipse(0.1, 0.1);
	Shape r6 = new Ellipse(0.0, 0.1);
	Shape r7 = new Ellipse(pi, pi);
	
	@Test
	public void areaTestInts(){
		assertEquals(a(5,5), r1.getArea(), 0.001);
		assertEquals(a(7,4), r2.getArea(), 0.001);
		assertEquals(a(4,7), r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(a(1.1,1.1), r4.getArea(), 0.001);
		assertEquals(a(0.1,0.1), r5.getArea(), 0.001);
		assertEquals(a(0.0,0.1), r6.getArea(), 0.001);
		assertEquals(a(pi,pi), r7.getArea(), 0);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(p(5,5), r1.getPerimeter(), 0.001);
		assertEquals(p(7,4), r2.getPerimeter(), 0.001);
		assertEquals(p(7,4), r3.getPerimeter(), 0.001);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(p(1.1,1.1), r4.getPerimeter(), 0.001);
		assertEquals(p(0.1,0.1), r5.getPerimeter(), 0.001);
		assertEquals(p(0.1,0.0), r6.getPerimeter(), 0.001);
		assertEquals(p(pi,pi), r7.getPerimeter(), 0);	
	}
	
	public double a(double x, double y){
		return pi * x * y;
	}
	
	public double p(double x, double y){
		if(x == 0 && y == 0){
			return x;
		}
		double h = Math.pow(x-y,2)/Math.pow(x+y,2);
		return pi * (x+y) *(1+((3*h)/(10+Math.sqrt(4-(3*h)))));
	}
}
