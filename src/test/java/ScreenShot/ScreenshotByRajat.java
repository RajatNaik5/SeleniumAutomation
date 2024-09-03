package ScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;


public class ScreenshotByRajat {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//Full page screenshot
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		
		//getting scrrenshot and save it is as File
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\screenss.png");
		
		sourcefile.renameTo(targetfile);*/
		
		WebElement featuredproducts=driver.findElement(By.xpath("//div[@id='feature']"));
		File sourcefile=featuredproducts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\screen.png");
		
		sourcefile.renameTo(targetfile);
		
	}

}
