package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPrivider
{
@Test(dataProvider ="Data ")

public void logi(String username,String password)
{
	WebDriver d= new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("http://www.demosite.center/wordpress/wp-login.php");
	d.findElement(By.id("user_login")).sendKeys(username);
	d.findElement(By.id("user_pass")).sendKeys(password  );
	d.findElement(By.id("wp-submit")).click();
	}

@DataProvider(name= "Data")
public Object[][] passdata(){
	Object[][] obj= new Object[3][2];
	obj[0][0]="admin1";
	obj[0][1]="admin123";
	obj[1][0]="admin";
	obj[1][1]="admin12";
	obj[2][0]="admin12";
	obj[2][1]="admin012";
	return obj;
	
}
}
