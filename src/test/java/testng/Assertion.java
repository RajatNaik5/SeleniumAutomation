package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
	@Test
	void assertion()
	{
		String name="Rajat";
		String game="Rajat";
		Assert.assertEquals(name,game);
		
		//we can also declare this using if condition
		if(name.equals(game))
		{
			System.out.println("both are equal");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("not equal");
			Assert.assertTrue(false);
		}
	}
}
