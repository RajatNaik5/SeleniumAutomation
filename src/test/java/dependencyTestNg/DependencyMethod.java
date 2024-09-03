package dependencyTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod 
{
	@Test
	void signup()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods={"signup"})
	void login()
	{
		Assert.assertTrue(true);

	}
	@Test(dependsOnMethods={"signup","login"})
	void search()
	{
		Assert.assertTrue(true);

	}
	
	
	
}
