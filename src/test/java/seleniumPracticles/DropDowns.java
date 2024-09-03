package seleniumPracticles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select element=new Select(dropdown);
		element.selectByIndex(3);
		
		List<WebElement> count_size=element.getOptions();
		System.out.println(count_size.size());
		
		for(int i=0;i<=count_size.size();i++)
		{
			System.out.println(count_size.get(i).getText());
		}
		
		
		
	}

}
