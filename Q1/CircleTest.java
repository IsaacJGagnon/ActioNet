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
		assertEquals(78.54, r1.getArea(), 0.01);
		assertEquals(153.94, r2.getArea(), 0.01);
		assertEquals(50.27, r3.getArea(), 0.01);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(3.8, r4.getArea(), 0.1);
		assertEquals(0.031, r5.getArea(), 0.001);
		assertEquals(0, r6.getArea(), 0);
		assertEquals(31.00627668, r7.getArea(), 0.0000001);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(31.42, r1.getPerimeter(), 0.01);
		assertEquals(43.98, r2.getPerimeter(), 0.01);
		assertEquals(25.13, r3.getPerimeter(), 0.01);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(6.91, r4.getPerimeter(), 0.01);
		assertEquals(0.63, r5.getPerimeter(), 0.01);
		assertEquals(0, r6.getPerimeter(), 0);
		assertEquals(19.7392088, r7.getPerimeter(), 0.000001);	
	}
}
