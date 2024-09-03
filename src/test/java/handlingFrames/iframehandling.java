package handlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().fullscreen();
		
		//Switch to frame1
		//WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		//driver.switchTo().frame(frame);
		
		//driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Rajat");
		
		//back to page
		//driver.switchTo().defaultContent();
		
		//Switch to frame2
		//WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		//driver.switchTo().frame(frame2);
		
		//driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Rajath");
		//driver.switchTo().defaultContent();
		
		//Switch to frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']"));
		//driver.switchTo().defaultContent();
		
		//innerframe in frame3
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();

		
		
		

		
		
	}

}
