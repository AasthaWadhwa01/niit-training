package junit;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest  {
	
	/* 
	  without mocking
	  
	 MyClass obj;

	@Before
	public void setUp(){
		obj=new MyClass();
		obj.setUtil(new Util());
	}
	
	@Test
	public void toPrint(){
	
		assertTrue(obj.toPrint(2).equals("The string value of integer 2 is two"));
		} */
		
	MyClass obj;
	MockUtil util = new MockUtil();
	
	@Before
	public void setUp(){
		obj = new MyClass();
		obj.setUtil(util);
	}
	
	@Test
	public void testToPrint(){
		util.setExpectedResult("two");
	   assertTrue(obj.toPrint(2).equals("The string value of integer 2 is two"));
	}	
	
}
