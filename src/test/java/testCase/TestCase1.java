package testCase;

import org.testng.annotations.Test;

public class TestCase1 
//Login Process in Application
{
	//Login
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Successfully open app");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Successfully Login");
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Successfully logout");
	}
}
