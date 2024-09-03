package seleniumDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*Test Case
 * 1.Launch the browser
 * 2.open URL https://demo.opencart.com/
 * 3.validate title should be "Your Store"
 * 4.Close the browser
 */
public class seleniumFirst {

	public static void main(String[] args) 
	{
		//1.Launch browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
	//OR
		WebDriver driver=new ChromeDriver();//this is best
		
		//2.open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3.Validate Title
		String title=driver.getTitle();
		if(title.equals("Your Store"))
				{
					System.out.println("Test Passes");
				}
		else
		{
			System.out.println("Test Failed");

		}
		driver.close();
	}
	

}
