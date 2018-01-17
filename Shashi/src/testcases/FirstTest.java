package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
	@BeforeClass
	
	public void setup()
	{
		Driver.Intialize();
	}
	@Test
	public void testCase()
	{
		Driver.Intialize.Instance.navigate.to();
	}
	@AfterClass
	public void cleanup()
	{
		Driver.Close();
	}
   

}
