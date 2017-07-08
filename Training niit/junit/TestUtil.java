package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import junit.framework.Assert;

public class TestUtil {
	private static final Object Object = null;
	Even util;
	
	@Before
	public void setup(){
		System.out.println("setting up");
		util= new Even();
	}
	
	@BeforeClass
	public static void myBeforeMethod(){
		System.out.println("Before class called");
	}
	
	@After
	public void tearDown(){
		System.out.println("Releasing");
		util=null;
	}
	
	@AfterClass
	public static void myAfterClass(){
		System.out.println("Called After class");
	}
	
	
	@Test
	public void testFirst(){
		Assert.assertEquals(String.class, util.getMessage().getClass());
	}
	
	@Test
	public void Addtest(){
			Assert.assertEquals(true, util.checkEven(48));
	}
	
	
	@Test
	public void assertNulltest(){
		Assert.assertNull(util);
		System.out.println("Assert null called");
	}
	/*@Expected
	public void testFirst(){
		Assert.assert
	}*/
	
}
