package junit;

import junit.framework.TestCase;

public class TestEven extends TestCase{
	
	Even even;
	
	public void setUp(){
		even = new Even();
	}

	public void testCheckEven(){
		assertTrue(even.checkEven(6));
	}
	
	public void testCheckEvenNegative(){
		assertTrue(!even.checkEven(1));
	}
	
	public void testSum(){
		assertEquals(5,even.sum(2, 3));
	}
}
