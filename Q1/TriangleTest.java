import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

public class TriangleTest{
	final double pi = Math.PI;
	
	//ints
	Shape r1 = new Triangle();
	Shape r2 = new Triangle(7,4,8);
	Shape r3 = new Triangle(8,7,4);
	//doubles
	Shape r4 = new Triangle(1.1,1.1,1.1);
	Shape r5 = new Triangle(0.1,0.1,0.1);
	Shape r6 = new Triangle(0.0,0.0,0.1);
	Shape r7 = new Triangle(pi,pi,pi);
	
	@Test
	public void areaTestInts(){
		assertEquals(6, r1.getArea(), 0.001);
		assertEquals(14, r2.getArea(), 0.01);
		assertEquals(14, r3.getArea(), 0.01);
		assertEquals(r2.getArea(), r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(0.52, r4.getArea(), 0.005);
		assertEquals(0.00433, r5.getArea(), 0.00001);
		assertEquals(0, r6.getArea(), 0.001);
		assertEquals(4.273664067, r7.getArea(), 0.00000001);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(12, r1.getPerimeter(), 0.001);
		assertEquals(19, r2.getPerimeter(), 0.001);
		assertEquals(19, r3.getPerimeter(), 0.001);
		assertEquals(r2.getPerimeter(), r3.getPerimeter(), 0.001);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(3.3, r4.getPerimeter(), 0.001);
		assertEquals(0.3, r5.getPerimeter(), 0.001);
		assertEquals(0.1, r6.getPerimeter(), 0.001);
		assertEquals(9.424777961, r7.getPerimeter(), 0.00000001);	
	}
}
