package grouping;

import org.testng.annotations.Test;

public class paymentTest 
{
	@Test(groups= {"sanity","regression","functional"})
	void paymentRupee()
	{
		System.out.println("Paisa");
	}
	@Test(groups= {"sanity","regression","functional"})
	void paymentDollar()
	{
		System.out.println("Dollar");
	}
	
}
