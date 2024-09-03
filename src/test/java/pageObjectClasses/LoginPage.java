package pageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By User_name_locate=By.xpath("//input[@placeholder='Username']");
	By Password_locate=By.xpath("//input[@placeholder='Password']");
	By Login_locate=By.xpath("//button[normalize-space()='Login']");
			
	
	//Action Methods
	public void set_User_name(String user)
	{
		driver.findElement(User_name_locate).sendKeys(user);
	}
	public void set_Password(String pwd)
	{
		driver.findElement(Password_locate).sendKeys(pwd);
	}
	public void click_Login()
	{
		driver.findElement(Login_locate).click();
	}


}
