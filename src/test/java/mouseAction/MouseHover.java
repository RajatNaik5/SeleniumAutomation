package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		
		WebElement Windows=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Apple=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//Performing Hover action using Actions class
		Actions hover=new Actions(driver);
		hover.moveToElement(Windows).moveToElement(Apple).click().perform();
		
		
		
	}

}
