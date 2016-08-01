import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

public class RectangleTest{
	final double pi = Math.PI;
	
	//ints
	Shape r1 = new Rectangle();
	Shape r2 = new Rectangle(7, 4);
	Shape r3 = new Rectangle(4, 7);
	//doubles
	Shape r4 = new Rectangle(1.1, 1.1);
	Shape r5 = new Rectangle(0.1, 0.1);
	Shape r6 = new Rectangle(0.0, 0.1);
	Shape r7 = new Rectangle(pi, pi);
	
	@Test
	public void areaTestInts(){
		assertEquals(25, r1.getArea(), 0.001);
		assertEquals(28, r2.getArea(), 0.001);
		assertEquals(28, r3.getArea(), 0.001);
		assertEquals(r2.getArea(), r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(1.21, r4.getArea(), 0.001);
		assertEquals(0.01, r5.getArea(), 0.001);
		assertEquals(0, r6.getArea(), 0.001);
		assertEquals(Math.pow(pi, 2), r7.getArea(), 0);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(20, r1.getPerimeter(), 0.001);
		assertEquals(22, r2.getPerimeter(), 0.001);
		assertEquals(22, r3.getPerimeter(), 0.001);
		assertEquals(r2.getPerimeter(), r3.getPerimeter(), 0.001);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(4.4, r4.getPerimeter(), 0.001);
		assertEquals(0.4, r5.getPerimeter(), 0.001);
		assertEquals(0.2, r6.getPerimeter(), 0.001);
		assertEquals(4 * pi, r7.getPerimeter(), 0);	
	}
}
