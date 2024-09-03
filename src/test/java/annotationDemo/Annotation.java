package annotationDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation 
{
	@BeforeMethod
	void login()
	{
		System.out.println("Login successfully");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search found successfully");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout successfully");
	}
	@Test(priority=2)
	void advsearch()
	{
		System.out.println("Advanced search successfully");
	}

}
