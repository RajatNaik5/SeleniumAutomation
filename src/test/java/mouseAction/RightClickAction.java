package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		
		
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Performing RightClick operation 
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		
		//to find an copy in Right Click
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Thread.sleep(5000);
		
		//close Alert box
		driver.switchTo().alert().accept();
		
		
	}

}
