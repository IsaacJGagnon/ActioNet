import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

public class TriangleTest{
	final double pi = Math.PI;
	
	//ints
	Shape r1 = new Triangle();
	Shape r2 = new Triangle(7,4,3);
	Shape r3 = new Triangle(3,7,4);
	//doubles
	Shape r4 = new Triangle(1.1,1.1,1.1);
	Shape r5 = new Triangle(0.1,0.1,0.1);
	Shape r6 = new Triangle(0.0,0.0,0.1);
	Shape r7 = new Triangle(pi,pi,pi);
	
	@Test
	public void areaTestInts(){
		assertEquals(a(3,4,5), r1.getArea(), 0.001);
		assertEquals(a(7,4,3), r2.getArea(), 0.001);
		assertEquals(a(3,7,4), r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(a(1.1,1.1,1.1), r4.getArea(), 0.001);
		assertEquals(a(0.1,0.1,0.1), r5.getArea(), 0.001);
		assertEquals(a(0.0,0.0,0.1), r6.getArea(), 0.001);
		assertEquals(a(pi,pi,pi), r7.getArea(), 0);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(p(3,4,5), r1.getPerimeter(), 0.001);
		assertEquals(p(7,4,3), r2.getPerimeter(), 0.001);
		assertEquals(p(3,7,4), r3.getPerimeter(), 0.001);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(p(1.1,1.1,1.1), r4.getPerimeter(), 0.001);
		assertEquals(p(0.1,0.1,0.1), r5.getPerimeter(), 0.001);
		assertEquals(p(0.0,0.0,0.1), r6.getPerimeter(), 0.001);
		assertEquals(p(pi,pi,pi), r7.getPerimeter(), 0);	
	}
	
	public double a(double x, double y, double z){
		double s = (x + y + z)/2;
		return Math.sqrt(s * (s - x) * (s - y) * (s - z));
	}
	
	public double p(double x, double y, double z){
		return x + y + z;
	}
}
