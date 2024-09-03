package seleniumPracticles;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//Capture Entire ScreenShot
		//TakesScreenshot ss=(TakesScreenshot) driver;
		//File sourcefile=ss.getScreenshotAs(OutputType.FILE);
		
		//File targetfile=new File(System.getProperty("user.dir")+"\\Screenshotfiles\\fullpage1.png");
		//sourcefile.renameTo(targetfile);
		
		//Capture specific Section Screenshot
		WebElement element=driver.findElement(By.xpath("//div[@id='header-inner']"));
		File source_file=element.getScreenshotAs(OutputType.FILE);
		File target_file=new File(System.getProperty("user.dir")+"\\Screenshotfiles\\fullpage2.png");
		source_file.renameTo(target_file);
		
		
		//Capture specific webelement it is same as above
	}

}
