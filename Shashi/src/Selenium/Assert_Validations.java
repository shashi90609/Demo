package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Validations {
  @Test
  public void f() {
	  
	  FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp="OrangeHRM";
		
		String act=d.getTitle();
		System.out.println(act);
		
		//Assert.assertEquals(exp, act);
		Assert.assertEquals(act, exp);
		
		// ( OR )
		
		//Assert.assertTrue(exp.contains(act));
		
		System.out.println("corect");
  }
}
