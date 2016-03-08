package base;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}
		Triangle test = new Triangle(4, 6, 8);
		@Test
		public void testPerimeter() 
		{
			assertTrue(new Triangle(1,2,3).getPerimeter() == 6.0);
			assertFalse(new Triangle(4,5,6).getPerimeter() == 96);
			assertTrue(test.getPerimeter() == 18.0);
			assertFalse(new Triangle().getPerimeter() == 196);
		}
		@Test
		public void testArea() 
		{
			assertTrue(new Triangle(3,4,5).getArea() == 6.0);
			assertFalse(test.getArea() == 420.0);
	}
}