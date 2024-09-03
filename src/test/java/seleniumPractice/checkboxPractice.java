package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().fullscreen();
		
		//Select all CheckBoxes
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input'] "));
		/*for(int i=0;i<checkboxs.size();i++)
		{
			checkboxs.get(i).click();
		}*/
		
		
		
		//Unselect already selected Checkboxes
		for(int i=0;i<3;i++)
		{
			checkboxs.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<checkboxs.size();i++)
		{
			if(checkboxs.get(i).isSelected())
			{
				checkboxs.get(i).click();

			}
		}
	}

}
