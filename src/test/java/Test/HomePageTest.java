package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.HomePage;

public class HomePageTest extends TestBase
{
    
	HomePage home; 
	@BeforeMethod
	public void openBroswer()
	{
      intilization();
      home = new HomePage();
	}
	
	@Test
	public void serachTest()
	{
		boolean result = home.serach();
		Assert.assertEquals(result, true);
	}
	
	@AfterMethod
	public void closeBroswer() throws Exception
	{
		Thread.sleep(5000);
		driver.close();
	}
}
