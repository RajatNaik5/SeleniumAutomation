package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		
		//driver.findElement(By.xpath("//header[@class='_3EOQ5Q']")).sendKeys("Hello java");
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Rajat");
	
		//by multiple attribures
		//driver.findElement(By.xpath("//input[@placeholder='Search for '][@name='Search']")).sendKeys("Rajat");

		//Xpath with AND operator
		//driver.findElement(By.xpath("//input[@name='r' and @type='text']")).sendKeys("Rajat");
		
		//Xpath with OR operator
		//driver.findElement(By.xpath("//input[@name='r' or @type='text']")).sendKeys("Rajat");
		
		//locate element by using inner text
		//driver.findElement(By.xpath("//*[text()='Best Deals on Smartphones']")).click();
		
		//boolean display_status=driver.findElement(By.xpath("//span[text()='Electronics']")).isDisplayed();
		//System.out.println(display_status);
		
		//String var=driver.findElement(By.xpath("//span[text()='Electronics']")).getText();
		//System.out.println(var);
		
		
		//xpath with contains method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Rajat");

		//xpath starts with method
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Rajat");

	
	}
	
	

}
