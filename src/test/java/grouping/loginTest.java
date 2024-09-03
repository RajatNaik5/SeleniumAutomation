package grouping;

import org.testng.annotations.Test;

public class loginTest 
{
	@Test(groups= {"sanity"})
	void loginbyemail()
	{
		System.out.println("login by email success");
	}
	@Test(groups= {"sanity"})
	void loginbynumber()
	{
		System.out.println("login by number success");
	}
}
