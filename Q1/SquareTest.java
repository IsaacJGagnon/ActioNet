import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.lang.Math;

public class SquareTest{
	final double pi = Math.PI;
	
	//ints
	Shape r1 = new Square();
	Shape r2 = new Square(7);
	Shape r3 = new Square(4);
	//double
	Shape r4 = new Square(1.1);
	Shape r5 = new Square(0.1);
	Shape r6 = new Square(0.0);
	Shape r7 = new Square(pi);
	
	@Test
	public void areaTestInts(){
		assertEquals(25, r1.getArea(), 0.001);
		assertEquals(49, r2.getArea(), 0.001);
		assertEquals(16, r3.getArea(), 0.001);
	}
	
	@Test
	public void areaTestDouble(){
		assertEquals(1.21, r4.getArea(), 0.001);
		assertEquals(0.01, r5.getArea(), 0.001);
		assertEquals(0, r6.getArea(), 0.001);
		assertEquals(9.869604401, r7.getArea(), 0.00000001);
	}
	
	@Test
	public void perimiterTestInts(){
		assertEquals(20, r1.getPerimeter(), 0.001);
		assertEquals(28, r2.getPerimeter(), 0.001);
		assertEquals(16, r3.getPerimeter(), 0.001);
	}
	
	@Test
	public void perimiterTestDouble(){
		assertEquals(4.4, r4.getPerimeter(), 0.001);
		assertEquals(0.4, r5.getPerimeter(), 0.001);
		assertEquals(0.0, r6.getPerimeter(), 0.001);
		assertEquals(12.56637061, r7.getPerimeter(), 0.0000001);	
	}
}
