package pageObjectClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	WebDriver driver;
	@BeforeClass
	 void setup()
	 {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
	 }
	@Test
	 void testLogin()
	 {
		LoginPage2 log=new LoginPage2(driver);
		log.set_User_name("Admin");
		log.set_Password("admin123");
		log.click_Login();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	 }
	@AfterClass
	 void tearDown()
	 {
		 driver.close();
	 }
}
