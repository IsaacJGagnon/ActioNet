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
		assertEquals(78.54, r1.getArea(), 0.001);
		assertEquals(87.96, r2.getArea(), 0.01);
		assertEquals(87.96, r3.getArea(), 0.01);
		assertEquals(r2.getArea(), r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(3.8, r4.getArea(), 0.1);
		assertEquals(0.031, r5.getArea(), 0.001);
		assertEquals(0, r6.getArea(), 0.001);
		assertEquals(31.00627668, r7.getArea(), 0.00000001);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(31.42, r1.getPerimeter(), 0.01);
		assertEquals(35.2, r2.getPerimeter(), 0.1);
		assertEquals(35.2, r3.getPerimeter(), 0.1);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(6.91, r4.getPerimeter(), 0.01);
		assertEquals(0.63, r5.getPerimeter(), 0.01);
		assertEquals(0.399839065, r6.getPerimeter(), 0.00000001);
		assertEquals(19.7392088, r7.getPerimeter(), 0.000001);	
	}
}
