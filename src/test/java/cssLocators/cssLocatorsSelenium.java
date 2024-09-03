package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocatorsSelenium {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().fullscreen();
		
		//find web element using tagname#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("shirts");
		
		//tag is optional we can also use this
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("shirts");
		
		//find web element using tag.class/.class name
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Tshirts");
		
		//find web element using tag.attribute/.attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Tshirts");
		
		//find web element using tag.class.attribute
		driver.findElement(By.cssSelector("i")).sendKeys("Tshirts");



	}

}
