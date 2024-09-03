import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMethods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		//System.out.println(windowids);
		
		List<String> winid=new ArrayList(windowids);
		String Parentid=winid.get(0);
		String childid=winid.get(1);
		
		driver.switchTo().window(Parentid);
		System.out.println(driver.getTitle());


		
	}

}
