package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		//getWindowhandle-reurns ID of the single browser window
		//String webid=driver.getWindowHandle();
		//System.out.println(webid);
		
		//returns ID of the multiple browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		 Set<String> webids=driver.getWindowHandles();
		System.out.println(webids);
		

		


		
	}

}
