package seleniumPracticles;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOk {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Thread.sleep(5000);
		
		//First Type only Accept(Ok) button
		//driver.switchTo().alert().accept();
		
		
		//Second type there is 2 button, Ok and Cancel
		//driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		
		//third type is send some text into box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		System.out.println("Text is:"+myalert.getText());
		myalert.sendKeys("Rajat");
		myalert.accept();
		
		//Verifying our input is correct/not
		String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(res.contains("Rajat"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");

		}
		
		
		
		
	}

}
