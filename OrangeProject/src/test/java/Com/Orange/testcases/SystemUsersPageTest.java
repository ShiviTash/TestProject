package Com.Orange.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Orange.base.BaseClass;
import Com.Orange.pages.HomePage;
import Com.Orange.pages.SearchPage;
import Com.Orange.pages.SystemUsersPage;

public class SystemUsersPageTest extends BaseClass {
	SystemUsersPage searchuser;
	
	@Test(priority = 4)
	public void searchtabTest(String name) throws InterruptedException
	{
		searchuser=searchuser.Searchuser();		
		Thread.sleep(3000);		
		Assert.assertNotNull(searchuser);
		System.out.println("SystemUsersPageTest is passed");
		
	}
}
