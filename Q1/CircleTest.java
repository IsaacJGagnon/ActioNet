import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

public class CircleTest{
	final double pi = Math.PI;
	
	//ints
	Shape r1 = new Circle();
	Shape r2 = new Circle(7);
	Shape r3 = new Circle(4);
	//doubles
	Shape r4 = new Circle(1.1);
	Shape r5 = new Circle(0.1);
	Shape r6 = new Circle(0.0);
	Shape r7 = new Circle(Math.PI);
	
	@Test
	public void areaTestInts(){
		assertEquals(a(5), r1.getArea(), 0.001);
		assertEquals(a(7), r2.getArea(), 0.001);
		assertEquals(a(4), r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(a(1.1), r4.getArea(), 0.001);
		assertEquals(a(0.1), r5.getArea(), 0.001);
		assertEquals(a(0.0), r6.getArea(), 0.001);
		assertEquals(a(pi), r7.getArea(), 0);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(p(5), r1.getPerimeter(), 0.001);
		assertEquals(p(7), r2.getPerimeter(), 0.001);
		assertEquals(p(4), r3.getPerimeter(), 0.001);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(p(1.1), r4.getPerimeter(), 0.001);
		assertEquals(p(0.1), r5.getPerimeter(), 0.001);
		assertEquals(p(0.0), r6.getPerimeter(), 0.001);
		assertEquals(p(pi), r7.getPerimeter(), 0);	
	}
	
	public double a(double n){
		return pi * Math.pow(n,2);
	}
	
	public double p(double n){
		return 2*pi*n;
	}
}
