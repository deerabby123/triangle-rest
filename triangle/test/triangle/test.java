package triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
	private triangle calc; 

	@Before
	public void setUp() throws Exception {
		System.out.println("������ǰ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("�����Ժ�");
	}

	@Test
	public void test() {
		 calc = new triangle (); 
		 assertEquals (2, calc.triangles(2,5,5)); 	
	}

}
