package locators;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class locatorsDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//Id
		//boolean status=driver.findElement(By.id("header-cart")).isDisplayed();
		//System.out.println(status);
		
		//linktext
		//driver.findElement(By.linkText("Phones & PDAs")).click();
		
		//PartialLink Text
		//driver.findElement(By.partialLinkText("Phone")).click();
		
		//locate group of web elements
		List<WebElement> header_elements=driver.findElements(By.className("list-inline-item"));
		System.out.println(header_elements.size());
		
		//find group of web elements using Tag Name
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//find total image
		List<WebElement> images=driver.findElements(By.className("_1XmrCc"));
		System.out.println(images.size());
		
		

		
	}

}
