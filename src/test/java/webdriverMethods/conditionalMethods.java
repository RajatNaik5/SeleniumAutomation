package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().fullscreen();
		
		
		//check isDisplayed method
		//driver.findElement(By.cssSelector(".ico-register")).click();
		//boolean element=driver.findElement(By.xpath("//h1[normalize-space()='Register']")).isDisplayed();
		//driver.manage().window().fullscreen();
		//System.out.println(element);
		
		//check isEnable method
		//driver.findElement(By.cssSelector(".ico-register")).click();
		//boolean enable=driver.findElement(By.cssSelector("input#FirstName")).isDisplayed();
		//System.out.println(enable);
		
		//check isSelected method
		driver.findElement(By.cssSelector(".ico-register")).click();
		WebElement male=driver.findElement(By.cssSelector("input#gender-male"));
		WebElement female=driver.findElement(By.cssSelector("input#gender-female"));
		
		male.click();
		female.click();


		System.out.println(male.isSelected());
		System.out.println(female.isSelected());



		
		



	}

}
