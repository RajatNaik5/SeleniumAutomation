package dropDown2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class dropdown2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().fullscreen();
		
		WebElement element=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpelement=new Select(element);
		drpelement.selectByIndex(2);
		//drpelement.selectByVisibleText("France");//represents webelement
		//drpelement.selectByValue();//represents attribute of the element
		
		//Capture the total options
		List<WebElement> getEle=drpelement.getOptions();
		System.out.println(getEle.size());
		
	}

}
