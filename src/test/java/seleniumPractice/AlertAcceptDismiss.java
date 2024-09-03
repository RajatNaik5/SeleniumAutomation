package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAcceptDismiss {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().fullscreen();
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//Thread.sleep(5000);
		
		//accept and dismiss method
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(5000);
		promptAlert.sendKeys("Rajat");
		Thread.sleep(5000);
		promptAlert.accept();
	}

}
