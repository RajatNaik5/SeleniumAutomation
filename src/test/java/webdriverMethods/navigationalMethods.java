package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class navigationalMethods {

	public static  void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		
		//navigate().to(URL)
		URL myurl=new URL("https://www.flipkart.com/");
		driver.navigate().to(myurl);
		
		//navigate().back
		driver.navigate().to("https://web.whatsapp.com/");
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//navigate().forward
		driver.navigate().forward();

		
		//Refresh the page navigate().refresh();
		driver.navigate().refresh();

		

	}

}
