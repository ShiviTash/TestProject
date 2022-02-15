package Com.Orange.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Orange.base.BaseClass;
import Com.Orange.pages.HomePage;

public class HomePageTest extends BaseClass
{
	HomePage homepage;
	
	@Test(priority = 3)
	public void admintabTest() throws InterruptedException
	{
		homepage=loginpage.login();
		homepage.clickOnAdmin();
		Thread.sleep(3000);
		String expUrl="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		String actUrl = driver.getCurrentUrl();
		Assert.assertEquals(actUrl, expUrl);
		System.out.println("admintabTest is passed");
	}
}
