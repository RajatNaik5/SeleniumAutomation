package pageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	//Using Pagefactory
	WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locate web element
	@FindBy(xpath="//input[@placeholder='Username']") WebElement user_name;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement pass_word;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_btn;
	
	//Locating Group of web element 
	@FindBy(tagName="a")
	List<WebElement> links;

	//Action Method
	public void set_User_name(String user)
	{
		user_name.sendKeys(user);
	}
	public void set_Password(String pwd)
	{
		pass_word.sendKeys(pwd);
	}
	public void click_Login()
	{
		login_btn.click();
	}
	
}
