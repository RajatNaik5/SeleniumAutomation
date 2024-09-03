package grouping;

import org.testng.annotations.Test;

public class signupTest 
{
	@Test(groups= {"regression"})
	void signupbyemail()
	{
		System.out.println("signing success by email");

	}
	@Test(groups= {"regression"})
	void signupbynumber()
	{
		System.out.println("signing success by number");
	}
	
	
}
