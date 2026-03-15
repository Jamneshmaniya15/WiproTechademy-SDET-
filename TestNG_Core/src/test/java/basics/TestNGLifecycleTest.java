package basics;

import org.testng.annotations.*;
 
public class TestNGLifecycleTest
{
 
	@BeforeMethod
	public void setup()
	{
		System.out.println("Browser Launch");
	}
	@Test
	public void test()
	{
		System.out.println("Executing Login Test");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("close Browser");
	}
	
}
 
 
