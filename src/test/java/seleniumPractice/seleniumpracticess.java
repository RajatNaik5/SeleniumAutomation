package seleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpracticess {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		
		//find earbuds in flipkart ecommecrce website by automatic
		//driver.findElement(By.name("q")).sendKeys("earbuds");
		
		//Count total number of we elements in header
		//List<WebElement> header_elements=driver.findElements(By.tagName("img"));
		//System.out.println(header_elements.size());
		
		//linktext
		//driver.findElement(By.linkText("Login")).click();
		
		//goto cart in flipkart
		//driver.findElement(By.cssSelector("div[class='H6-NpN']")).click();
		
		//find search cart using cssselector tag name['attribute']
		//driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("sweter");
		
		//driver.findElement(By.cssSelector("div[class='_1ZMrY_']")).click();
		
		//tagname.class name
		List<WebElement> total=driver.findElements(By.cssSelector("a._1ch8e_"));
		System.out.println(total.size());
		
	}
	

}
