package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);	
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}

}
