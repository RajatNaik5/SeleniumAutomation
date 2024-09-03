package DataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo 
{
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="dp")
	void login(String email,String Password)
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		boolean status=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	@DataProvider(name="dp",indices= {0,3})
	Object[][] logindata()
	{
		Object data[][]= {
				{"rajat","1234"},
				{"raju","3214"},
				{"hari","5678"},
				{"Admin","admin123"},
				{"loki","1595"},
					
				};
		return data;
	}
}

