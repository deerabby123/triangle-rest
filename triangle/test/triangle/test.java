package triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
	private triangle calc; 

	@Before
	public void setUp() throws Exception {
		System.out.println("测试以前");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试以后");
	}

	@Test
	public void test() {
		 calc = new triangle (); 
		 assertEquals (2, calc.triangles(2,5,5)); 	
	}

}
