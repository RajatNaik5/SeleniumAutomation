package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AllAssertions 
{
	@Test
	//void hardassertion()
	//{
		//Assert.assertEquals("Rajat","Rajat");
		
		//Assert.assertNotEquals(501,204);
		
		//Assert.assertTrue(false);
		
		//Assert.assertFalse(true);
	
		//Assert.fail();//failed the test method
	//}
	void softassertion()//there is static methods in soft assert class we have to create object
	{
		SoftAssert as=new SoftAssert();
		
		System.out.println("hello rajau");

		as.assertEquals(5,6);
		
		System.out.println("hello rajat");
		as.assertAll();//this is mandatory bcz it shows result alwats PASSED
	}
			
}
	

