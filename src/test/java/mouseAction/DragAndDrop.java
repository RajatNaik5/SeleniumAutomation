package mouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);

		WebElement Source=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Target=driver.findElement(By.xpath("//div[@id='box105']"));
		
		act.dragAndDrop(Source, Target).perform();

	}

}
