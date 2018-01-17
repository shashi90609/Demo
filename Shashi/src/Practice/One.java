package Practice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class One 
{
	@Test
	
	public void a()
	{
		WebDriver d=new FirefoxDriver();
		d.get("");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(d,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		boolean status=ele.isDisplayed();
		if(status){
			System.out.println("displayed");
		}
		else
			System.out.println("not");
				
			}
		
		
				
			
	}
	
	


